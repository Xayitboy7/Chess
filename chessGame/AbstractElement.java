package chessGame;

public abstract class AbstractElement {
    private String name;
    private String color;
    public int xPosition;
    public int yPosition;
    
    public abstract boolean MovePositionPiece(int x2, int y2);
    // public abstract boolean checkMovePositionFree(AbstractElement selectedElement, int x2, int y2);


    public String getName(){
        return name;
    }
    
    public void setName(String name) { 
        this.name = name;
    }

    public void setColor(String color) {
        this.color=color;
    }

    public String getColor(){
        return color;
    }
}
