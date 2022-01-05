
package application;

import chess.ChessMatch;

public class Program {
    public static void main (String [] args){
        
        ChessMatch chessMatch = new ChessMatch();
        //para imprimir as peças da partida:
        UI.printBoard(chessMatch.getPieces());
    }
}
