package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChesPiece extends Piece {

    private Color color;

    public ChesPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

}
