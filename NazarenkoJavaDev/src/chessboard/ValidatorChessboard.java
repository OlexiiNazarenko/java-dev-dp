package chessboard;

public class ValidatorChessboard extends service.Validator {
    private final int ARGS_NUMBER = 2;
    private String exceptionText;
    private boolean validity;
    private int validHeight;
    private int validWidth;

    public ValidatorChessboard(String[] args) {

        validity = validateArgs(args);
    }

    public String getExceptionText() {
        return exceptionText;
    }

    public boolean getValidity() {
        return validity;
    }

    public int getValidHeight() {
        return validHeight;
    }

    public int getValidWidth() {
        return validWidth;
    }

    @Override
    public String toString() {
        return exceptionText;
    }

    private boolean validateArgs(String[] args) {

        if(validateArgsLength(args)) {
            return validateArgsType(args);
        } else {
            return false;
        }
    }

    private boolean validateArgsLength(String[] args) {

        if (args.length == 0) {
            // displays instructions for using the program when run without parameters
            this.exceptionText = "The program displays a chessboard with given dimensions of height and width." +
                    "\nHeight and width must be integer numbers.";
            return false;
        } else if (args.length != ARGS_NUMBER) {// validates args number
            this.exceptionText = "Too little or too many arguments. Arguments number must be 2: height and width.";
            return false;
        }

        return true;
    }

    private boolean validateArgsType(String[] args) {
        try {
            validHeight = Integer.parseInt(args[0]);
            validWidth = Integer.parseInt(args[1]);
            return true;
        } catch (Exception e) {
            this.exceptionText = e.getMessage();
            return false;
        }
    }
}
