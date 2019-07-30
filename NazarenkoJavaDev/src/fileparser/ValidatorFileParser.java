package fileparser;

import service.ArgumentsNumberException;

import java.io.File;
import java.io.FileNotFoundException;

public class ValidatorFileParser {
    private int argsNumberMin = 2;
    private int argsNumberMax = 3;
    private String exceptionText;
    private boolean validity;
    private File validFile;
    private int argsNumber;

    public ValidatorFileParser() {}

    public File getValidFile() {
        return validFile;
    }

    public String getExceptionText() {
        return exceptionText;
    }

    public boolean getValidity() {
        return validity;
    }

    public int getArgsNumber() {
        return argsNumber;
    }

    public void validateArgs(String[] args) {
        try {
            validateArgsNumber(args.length);
            argsNumber = args.length;
            checkFile(args[0]);
            validity = true;
        } catch (ArgumentsNumberException | FileNotFoundException e) {
            exceptionText = e.getMessage();
            validity = false;
        }
    }

    private void validateArgsNumber(int length) throws ArgumentsNumberException {
        if(length < argsNumberMin || length > argsNumberMax) {
            throw new ArgumentsNumberException();
        }
    }

    private void checkFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        if(!file.exists()){
            throw new FileNotFoundException("File not found.");
        } else {
            validFile = file;
        }
    }

}
