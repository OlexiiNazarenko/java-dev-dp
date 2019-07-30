package fileparser;

import service.ConsoleWriter;
import service.ReaderFromFile;
import service.WriterToFile;

import java.io.IOException;

public class AppFileParser {
    public static void main(String[] args) {
        ValidatorFileParser validatorFileParser = new ValidatorFileParser();
        validatorFileParser.validateArgs(args);
        String outputMessage = "";
        if(validatorFileParser.getValidity()){
            ReaderFromFile rff = new ReaderFromFile();
            rff.readTextFile(validatorFileParser.getValidFile());
            if(rff.isSuccessful()) {
                WorkFile workFile = new WorkFile(rff.getFileText());
                if (validatorFileParser.getArgsNumber() == 2) {
                    outputMessage = workFile.countOccurrences(args[1]);
                } else if (validatorFileParser.getArgsNumber() == 3) {
                    outputMessage = workFile.replace(args[1], args[2]);
                    try {
                        WriterToFile.writeToFile(validatorFileParser.getValidFile(), workFile.getFileText());
                    } catch (IOException e) {
                        outputMessage = e.getMessage();
                    }
                }
            } else {
                outputMessage = rff.getExceptionText();
            }
        } else {
            outputMessage = validatorFileParser.getExceptionText();
        }
        ConsoleWriter.printText(outputMessage);
    }
}
