package numericsequence;

public class Square {
    private String numericSequence;

    public Square(double max) {
        this.numericSequence = calculateNumericSequence(max);
    }

    public String getNumericSequence() {
        return numericSequence;
    }

    private String calculateNumericSequence(double max) {
        String out = "";
        double sq = 0;
        int num = 0;

         do {
             num++;
             sq = Math.pow(num, 2);
             if(sq <= max) {
                 out = out.concat(num + ",");
             } else {break;}
        } while (true);

        return out.substring(0, out.length() - 1);
    }
}
