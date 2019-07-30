package luckytickets;

import service.ConsoleReader;
import service.ConsoleWriter;
import service.ReaderFromFile;

import java.io.IOException;

public class AppLuckyTickets {
    public static void main(String[] args) {
        ConsoleReader consoleReader = new ConsoleReader();
        ValidatorLuckyTickets validator = new ValidatorLuckyTickets();
        boolean answer = false;

        ConsoleWriter.printText("The program displays the number of lucky ticket numbers in a given range, calculated in three ways:\n" +
                "1) Moscow: if a six-digit number is printed on the ticket, and the sum of the first three digits is equal to the sum of the last three, then this ticket is considered happy.\n" +
                "2) St. Petersburg: if the sum of the even positions of the ticket is equal to the sum of the odd numbers of the ticket, then the ticket is considered happy.\n" +
                "3) Dnipro: if the sum of the even numbers of the ticket is equal to the sum of the odd numbers of the ticket, then the ticket is considered happy.\n" +
                "The range of ticket numbers is indicated in the text file.\n" +
                "The path to the text file is set in the console.");

        do {
            try {
                String filePath = consoleReader.readFromConsole("File path");
                boolean isValidFile = validator.validateFile(filePath);
                if (!isValidFile) {
                    ConsoleWriter.printText(validator.getExceptionText());
                    answer = consoleReader.askToContinue();
                } else {
                    ReaderFromFile rff = new ReaderFromFile();
                    rff.readTextFile(validator.getValidFile());
                    String params = rff.getFileText()[0];
                    validator.validateArgs(params);
                    if(validator.getValidity()) {
                        LuckyTicketsCalculator luckyTicketsCalculator =
                                new LuckyTicketsCalculator(
                                        validator.getValidStartNumber(),
                                        validator.getValidEndNumber()
                                );
                        luckyTicketsCalculator.calculate();
                        ConsoleWriter.printText(luckyTicketsCalculator.toString());
                    } else {
                        ConsoleWriter.printText(validator.getExceptionText());
                        answer = consoleReader.askToContinue();
                    }
                }
            } catch (IOException e) {
                ConsoleWriter.printText(e.getMessage());
                answer = consoleReader.askToContinue();
            }
        } while (answer);
    }
}
