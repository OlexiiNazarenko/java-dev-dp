package chessboard;

public class Chessboard {
    private int height;
    private int width;

    public Chessboard(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public static Chessboard createChessboardFromInput(int[] params) {
        int height = params[0];
        int width = params[1];
        return new Chessboard(height, width);
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

}
