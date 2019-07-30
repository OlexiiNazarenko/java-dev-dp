package service;

public class ArgumentsNumberException extends Exception {

    public ArgumentsNumberException() {
        super("Too many or too little arguments");
    }

    public ArgumentsNumberException(String s) {
        super(s);
    }
}
