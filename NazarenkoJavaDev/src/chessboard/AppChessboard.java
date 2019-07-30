package chessboard;

import service.ConsoleWriter;

public class AppChessboard {
    public static void main(String[] args) {

        ValidatorChessboard validatorChessboard = new ValidatorChessboard(args);

        if(validatorChessboard.getValidity()) {
            Chessboard chessboard = ChessboardFactory.createChessboard(validatorChessboard);
            ChessboardConstructor chessboardConstructor = new ChessboardConstructor(chessboard);
            chessboardConstructor.constructChessboard();
            ConsoleWriter.printText(chessboardConstructor.toString());
        } else  {
            ConsoleWriter.printMessage(validatorChessboard);
        }
    }
}
