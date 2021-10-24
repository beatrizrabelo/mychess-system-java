package boardgame;

public class Piece {
    //protected -> somentes classes dentro do mesmo pacote e subclasses que vão ter acesso
    
    protected Position position;  
    private Board board;
    
    public Piece (Board board){
        this.board = board;
        position = null;
    }
    
    protected  Board getBoard(){
        return board;
    }
}
