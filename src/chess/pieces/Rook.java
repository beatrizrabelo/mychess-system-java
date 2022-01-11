package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece{

    public Rook(Color color, Board board) {
        super(color, board);
    }

    public Rook(Board board, Color color) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    @Override
    public String toString(){
        return "R";
    }
    
    @Override
    public boolean[][] possibleMoves() {
        boolean [][] mat = new boolean [getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
