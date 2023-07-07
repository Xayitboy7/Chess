package chessGame;
public class Ot extends AbstractElement{
    public Ot(int xPosition , int yPosition,String color, String name){
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.setName(name);
        this.setColor(color);
    }

    @Override
    public boolean MovePositionPiece(int x2, int y2){
        if(Math.abs(xPosition-x2) == 1 && Math.abs(yPosition-y2) == 2  || Math.abs(xPosition-x2) == 2 && Math.abs(yPosition-y2) == 1){
            xPosition = x2;
            yPosition = y2;
            return true;
        }else{
            System.out.println("Invalid move");
            return false; 
        }
    }
}