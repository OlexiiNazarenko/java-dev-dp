package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public ConsoleReader() {}

    public boolean askToContinue() {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer = "n";

        System.out.println("Do you want to continue?");

        try {
            answer = br.readLine();
//            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes"));
    }

    public String readFromConsole(String message) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(message);
        String in = br.readLine();
//        br.close();

        return in;
    }

    public void close() throws IOException {
        br.close();
    }

}
