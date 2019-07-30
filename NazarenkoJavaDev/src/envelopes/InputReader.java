package envelopes;

import java.util.Scanner;

public class InputReader {

    public static double[] read() {
        Scanner sc = new Scanner(System.in);
        double[] params = new double[4];

        System.out.println("There are two envelopes with sides (a, b) and (c, d)." +
                "\nThe program checks whether one envelope can be put in another." +
                "\nParameters can be floating point numbers.");
        System.out.println("First envelope:");
        params[0] = readParameter("width 1:");
        System.out.println("width 1 = " + params[0]);
        params[1] = readParameter("height 1:");

        System.out.println("Second envelope:");
        params[2] = readParameter("width 2:");
        params[3] = readParameter("height 2:");

        return params;
    }

    private static double readParameter(String parameterName) {
        boolean a;
        double res = 0.0;
        Scanner sc = new Scanner(System.in);

        /* ask user to enter parameter
        validate if parameter is double
        if it is not ask user to enter again
         */
        do {
            System.out.println(parameterName);
            String respond = sc.nextLine();

            // validation
            try {
                res = Double.parseDouble(respond);
                a = true;
            } catch (Exception e) {
                System.out.println("Parameter must be floating point number.");
                a = false;
            }
        } while (a == false);
        return res;
    }
}
