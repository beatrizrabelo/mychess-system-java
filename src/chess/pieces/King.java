package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

    public King(Color color, Board board) {
        super(color, board);
    }

    public King(Board board, Color color) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public String toString() {
        return "K";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean [][] mat = new boolean [getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
