package fibonacci;

import service.ConsoleWriter;

public class AppFibonacci {
    public static void main(String[] args) {
        String output = "";
        ValidatorFibonacci validatorFibonacci = new ValidatorFibonacci(args);

        if(validatorFibonacci.getValidity()){
            Fibonacci fibonacci = new Fibonacci(validatorFibonacci.getMaxNumber());
            output = fibonacci.toString(validatorFibonacci.getMinNumber());
        } else {
            output = validatorFibonacci.getExceptionText();
        }
        ConsoleWriter.printText(output);
    }
}
