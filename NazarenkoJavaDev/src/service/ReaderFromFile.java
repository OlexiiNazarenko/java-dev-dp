package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReaderFromFile {
    private String[] fileText;
    private boolean isSuccessful;
    private String exceptionText;

    public ReaderFromFile(){
    }

    public String[] getFileText() {
        return fileText;
    }

    public boolean isSuccessful() {
        return isSuccessful;
    }

    public String getExceptionText() {
        return exceptionText;
    }

    public void readTextFile(File file) {
        String[] out = {};
        List<String> fileStringsList = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                fileStringsList.add(line);
            }
            isSuccessful = true;
            br.close();
            fileText = fileStringsList.toArray(out);
        }catch (IOException e) {
            isSuccessful = false;
            exceptionText = e.getMessage();
        }
    }
}
