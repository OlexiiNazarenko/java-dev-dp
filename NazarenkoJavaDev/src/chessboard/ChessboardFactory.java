package chessboard;

public class ChessboardFactory {
    public static Chessboard createChessboard(ValidatorChessboard validatorChessboard) {
        int height = validatorChessboard.getValidHeight();
        int width = validatorChessboard.getValidWidth();
        return new Chessboard(height, width);
    }
}
