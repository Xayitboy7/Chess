package chessGame;
public class Ferzi extends AbstractElement{

    public Ferzi(int xPosition, int yPosition, String name, String color){
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.setName(name);
        this.setColor(color);
    }

    @Override
    public boolean MovePositionPiece(int x2,int y2){
        if(Math.abs(xPosition-x2) == Math.abs(yPosition-y2) || Math.abs(xPosition-x2) == 0 && Math.abs(yPosition-y2) != 0 ||
            Math.abs(xPosition-x2) != 0 && Math.abs(yPosition-y2) == 0){
                xPosition = x2;
                yPosition = y2;
            return true;
        }else{
            System.out.println("Invalid move");
            return false;
        }
    }
}
