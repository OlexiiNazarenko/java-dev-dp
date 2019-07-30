package service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class WriterToFile {
    public static void writeToFile(File file, String[] fileText) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for (String s : fileText) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
}
