package luckytickets;

import java.io.File;

public class ValidatorLuckyTickets {
    private int argsNumber = 2;
    private String exceptionText;
    private boolean validity;
    private File validFile;
    private int validStartNumber;
    private int validEndNumber;


    public ValidatorLuckyTickets() {}

    public String getExceptionText() {
        return exceptionText;
    }

    public File getValidFile() {
        return validFile;
    }

    public boolean getValidity() {

        return validity;
    }

    public int getValidStartNumber() {
        return validStartNumber;
    }

    public int getValidEndNumber() {
        return validEndNumber;
    }

    public boolean validateFile(String filePath) {
        File f = new File(filePath);
        if(f.exists()) {
            validFile = f;
            return true;
        } else {
            exceptionText = "No such file found";
            return false;
        }
    }

    public void validateArgs(String args) {
        String[] params = parseParams(args);
        try {
            validStartNumber = Integer.parseInt(params[0]);
            validEndNumber = Integer.parseInt(params[1]);
            validity = true;
        } catch (NumberFormatException e) {
            validity = false;
            exceptionText = e.getMessage();
        }
    }

    private String[] parseParams (String args) {
        return args.split(",");
    }

}
