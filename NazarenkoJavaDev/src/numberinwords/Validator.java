package numberinwords;

public class Validator {
    private int argsNumber = 1;
    private String exceptionText;
    private boolean validity;

    public Validator(String[] args) {
        validity = validateArgs(args);
    }

    public String getExceptionText() {
        return exceptionText;
    }

    public boolean getValidity() {
        return validity;
    }

    private boolean validateArgs(String[] args) {
        if(args.length == 0) {
            // displays instructions for using the program when run without parameters
            this.exceptionText = "The program converts an integer into words.";
            return false;
        } else if(args.length != argsNumber) {// validates args number
            this.exceptionText = "Too little or too many arguments.";
            return false;
//        } else if(args[0].length() > 10) {
//            this.exceptionText = "Too long number";
//            return false;
        }

        return true;
    }
}
