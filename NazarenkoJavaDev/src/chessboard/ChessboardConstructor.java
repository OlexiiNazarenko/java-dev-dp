package chessboard;

public class ChessboardConstructor {
    private String a = "#";
    private String s = " ";
    private Chessboard chessboard;
    private String chessboardStructure;

    public ChessboardConstructor(Chessboard chessboard) {
        this.chessboard = chessboard;
    }

    public void constructChessboard() {
        String out = "";
        for (int i = 0; i < chessboard.getHeight(); i++) {
            String line = "";

            // build line
            for (int j = 0; j < chessboard.getWidth(); j++) {
                if (j % 2 == 0) {
                    line = line + a;
                } else {
                    line = line + s;
                }
            }

            // reverse for odd lines
            if (i % 2 != 0) {
                char c = line.charAt(0);
                line = line.substring(1);
                if(chessboard.getWidth() % 2 == 0) {
                    line = line + a;
                } else {
                    line = line + s;
                }
            }

            out = out.concat(line + "\n");
        }

        chessboardStructure = out;
    }

    public String toString() {
        return chessboardStructure;
    }
}




