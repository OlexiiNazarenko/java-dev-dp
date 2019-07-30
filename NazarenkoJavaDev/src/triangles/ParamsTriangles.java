package triangles;

import service.ConsoleReader;

import java.io.IOException;
import java.util.ArrayList;

public class ParamsTriangles {
    private ArrayList<String> paramsInp = new ArrayList<>();
    private String[] params = {};

    String programDescription = "The program outputs triangles in descending order by area." +
            "\nEach triangle is determined by the name and length of its sides." +
            "\nInput format: <name>, <side length>, <side length>, <side length>.";

    public ParamsTriangles() {}

    public String[] getParams() {
        return params;
    }

    public String getProgramDescription() {
        return programDescription;
    }

    public void readParams() {
        boolean answer = false;

        do {
            ConsoleReader cr = new ConsoleReader();
//            String param = "";
            try {
//                param = ;
                paramsInp.add(cr.readFromConsole("Enter triangle parameters:"));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            answer = new ConsoleReader().askToContinue();
        } while (answer);
        params = paramsInp.toArray(params);
    }

}
