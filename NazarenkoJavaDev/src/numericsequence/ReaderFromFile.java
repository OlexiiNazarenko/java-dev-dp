package numericsequence;

import java.io.*;

public class ReaderFromFile {
    private File file;
    private String fileText;

    public ReaderFromFile(File file) {
        this.file = file;
    }

    public String readFileText() throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        String out = "";

        while ((line = br.readLine()) != null) {
            out = out.concat(line);
        }

        return out;
    }
}
