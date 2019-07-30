package numericsequence;

import service.ArgumentsNumberException;

public class ValidatorNumericSequence {
    private static int argsNumber = 1;
    private String exceptionText = "";
    private boolean validity;
    private double validMax;

    public ValidatorNumericSequence(String[] args) {
        try {
            validMax = validateArgs(args);
            validity = true;
        } catch (NumberFormatException | ArgumentsNumberException e) {
            exceptionText = e.getMessage();
        }
    }

    public String getExceptionText() {
        return exceptionText;
    }

    public boolean getValidity() {
        return validity;
    }

    public double getValidMax() {
        return validMax;
    }

    private double validateArgs(String[] args) throws NumberFormatException, ArgumentsNumberException  {
        if (validateArgsLength(args.length)) {
            return Double.parseDouble(args[0]);
        }
        return 0;
    }

    private boolean validateArgsLength(int length) throws ArgumentsNumberException {
        if (length != argsNumber) {// validates args number
            throw new ArgumentsNumberException();
        }
        return true;
    }
}
