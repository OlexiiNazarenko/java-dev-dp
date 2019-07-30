package fibonacci;

import service.ArgumentsNumberException;

import java.io.File;
import java.io.FileNotFoundException;

public class ValidatorFibonacci {
    private int argsNumberMin = 1;
    private int argsNumberMax = 2;
    private String exceptionText;
    private boolean validity;
    private int argsNumber;
    private int numberLength;
    private int minNumber;
    private int maxNumber;

    public ValidatorFibonacci(String[] args) {
        validity = validateArgs(args);
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

    public int getMaxNumber() {
        return maxNumber;
    }

    public int getMinNumber() {
        return minNumber;
    }

    public int getNumberLength() {
        return numberLength;
    }

    public boolean validateArgs(String[] args) {
        try {
            validateArgsNumber(args.length);
            argsNumber = args.length;
            if(args.length == 1) {
                numberLength = Integer.parseInt(args[0]);
            } else if(args.length == 2) {
                minNumber = Integer.parseInt(args[0]);
                maxNumber = Integer.parseInt(args[1]);
            }
            return true;
        } catch (ArgumentsNumberException e) {
            exceptionText = e.getMessage();
            return false;
        }
    }

    private void validateArgsNumber(int length) throws ArgumentsNumberException {
        if(length < argsNumberMin || length > argsNumberMax) {
            throw new ArgumentsNumberException();
        }
    }





}
