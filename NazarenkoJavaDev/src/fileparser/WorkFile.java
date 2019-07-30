package fileparser;

public class WorkFile {

    private String[] fileText;

    WorkFile(String[] fileText) {
        this.fileText = fileText;
    }

    public String[] getFileText() {
        return fileText;
    }

    public String countOccurrences(String requestedLine) {
        String res = "";
        int occurrenceNumberAggregate = 0;

        for(int i = 0; i < fileText.length; i++) {
            int occurrencesInLine = countOccurrencesInLine(fileText[i], requestedLine);
            occurrenceNumberAggregate += occurrencesInLine;
        }
        res = "Found " + occurrenceNumberAggregate + " occurrences of line \"" + requestedLine + "\" in text" ;
        return res;
    }

    private int countOccurrencesInLine(String string, String requestedString) {
        int index = string.indexOf(requestedString);
        int occurrenceNumber = 0;

        while (index != -1) {
            occurrenceNumber++;
            string = string.substring(index + requestedString.length());
            index = string.indexOf(requestedString);
        }

        return occurrenceNumber;
    }

    public String replace(String requestedLine, String replacementLine) {
        for(int i = 0; i < fileText.length; i++) {
            fileText[i] = fileText[i].replace(requestedLine, replacementLine);
        }
        return "\nSuccessfully replaced \"" + requestedLine + "\" with \"" + replacementLine + "\"";

    }
}
