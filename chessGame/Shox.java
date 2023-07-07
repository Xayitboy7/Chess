package chessGame;
public class Shox extends AbstractElement{

    public Shox(int xPosition, int yPosition, String name, String color){
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.setColor(color);
        this.setName(name);
    }

    @Override
    public boolean MovePositionPiece(int x2, int y2){
        if(Math.abs(xPosition-x2) == 1 && Math.abs(yPosition-y2) == 1 
                || Math.abs(xPosition-x2) == 0 && Math.abs(yPosition-y2) == 1 
                || Math.abs(xPosition-x2) == 1 && Math.abs(yPosition-y2) == 0){
            xPosition = x2;
            yPosition = y2;
            return true;
        }else{
            System.out.println("Invalid move");
            return false;
        }
    }
}
