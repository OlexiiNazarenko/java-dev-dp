package fibonacci;

import java.util.ArrayList;

public class Fibonacci {
    ArrayList<Integer> fibonacci;

    public Fibonacci(int endPoint) {
        this.fibonacci = calculateFibonacci(endPoint);

    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for(Integer i : fibonacci) {
            sb.append(i + ",");
        }
        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }

    public String toString(int startPoint) {
        StringBuilder sb = new StringBuilder();

        for(Integer i : fibonacci) {
            if(i < startPoint) {
                continue;
            }
            sb.append(i + ",");
        }
        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }

    private ArrayList<Integer> calculateFibonacci(int endPoint) {
        ArrayList<Integer> fibArray = new ArrayList<>();
        int nextFibonacci = 0;
        int index = 2;

        fibArray.add(0, 0);
        fibArray.add(1, 1);
        if(endPoint > 1) {
             do {
                nextFibonacci = nextFibonacci(fibArray.get(index - 1), fibArray.get(index - 2));
                if(nextFibonacci > endPoint) {continue;}
                fibArray.add(index, nextFibonacci);
                index++;
            } while (nextFibonacci <= endPoint);
        }

        return fibArray;
    }

    private int nextFibonacci(int fibonacciN1, int fibonacciN2) {
        return  fibonacciN1 + fibonacciN2;
    }
}
