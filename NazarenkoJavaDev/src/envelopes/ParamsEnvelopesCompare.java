package envelopes;

import service.ConsoleReader;
import service.ConsoleWriter;

import java.io.IOException;

public class ParamsEnvelopesCompare {
    private double[] params = new double[4];
    private boolean validity;
    private String[] paramsDescriptions = {
            "First envelope width:",
            "First envelope height:",
            "Second envelope width:",
            "Second envelope height:"
    };


    public ParamsEnvelopesCompare() {}

    public double[] getParams() {
        return params;
    }

    public boolean getValidity() {
        return validity;
    }

    public void readParams() {
        for (int i = 0; i < paramsDescriptions.length; ++i) {
            params[i] = readParameter(paramsDescriptions[i]);
        }
    }

    private double readParameter(String paramName) {
        double res = 0.0;
        boolean answer = false;

        do {
            String width = "";
            try {
                ConsoleReader cr = new ConsoleReader();
                width = cr.readFromConsole(paramName);
                res = ValidatorEnvelope.validateArgsType(width);
                validity = true;
            } catch (IOException e) {
                ConsoleReader cr = new ConsoleReader();
                ConsoleWriter.printText(e.getMessage());
                answer = new ConsoleReader().askToContinue();
                validity = false;
            } catch (NumberFormatException e) {
                ConsoleWriter.printText(e.getMessage());
                answer = new ConsoleReader().askToContinue();
                validity = false;
            }
        } while (answer);

        return res;
    }
}
