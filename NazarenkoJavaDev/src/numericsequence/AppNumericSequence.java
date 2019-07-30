package numericsequence;

import service.ConsoleWriter;

public class AppNumericSequence {
    public static void main(String[] args) {
        if(args.length == 0) {
            ConsoleWriter.printMessage("The program displays a series of natural numbers separated by commas, " +
                    "the square of which is less than the given n.");
        }

        ValidatorNumericSequence validatorNumericSequence = new ValidatorNumericSequence(args);

        if(validatorNumericSequence.getValidity()){
            Square square = new Square(validatorNumericSequence.getValidMax());
            ConsoleWriter.printMessage(square.getNumericSequence());
        } else {
            ConsoleWriter.printMessage(validatorNumericSequence.getExceptionText());
        }
    }
}
