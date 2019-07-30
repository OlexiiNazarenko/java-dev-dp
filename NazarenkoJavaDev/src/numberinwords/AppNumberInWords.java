package numberinwords;

import service.ConsoleWriter;

public class AppNumberInWords {
    public static void main(String[] args) {
        Validator validator = new Validator(args);

        if(validator.getValidity()) {

        } else {
            ConsoleWriter.printMessage(validator.getExceptionText());
        }
    }
}
