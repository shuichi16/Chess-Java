package chess;

import boardgame.Board;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
    }

    public ChesPiece[][] getPieces() {
        ChesPiece[][] mat = new ChesPiece[board.getRow()][board.getColumn()];
        for (int i = 0; i < board.getRow(); i++) {
            for (int j = 0; j < board.getColumn(); j++) {
                mat[i][j] = (ChesPiece) board.piece(i, j);
            }
        }
        return mat;

    }
}
