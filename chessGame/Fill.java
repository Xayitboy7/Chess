package chessGame;
public class Fill extends AbstractElement{
    public Fill(int xPosition, int yPosition, String name, String color){
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.setColor(color);
        this.setName(name);
    }

    @Override
    public boolean MovePositionPiece(int x2, int y2){
        if(Math.abs(xPosition-x2) == Math.abs(yPosition-y2)){
            xPosition = x2;
            yPosition = y2;
            return true;
        }else{
            System.out.println("Invalid move");
            return false;
        }
    }
    
}
