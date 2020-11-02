public class MovableRectangle implements Movable{
    private MovablePoint topLeft = new MovablePoint(0,0,0,0);
    private MovablePoint bottomRight = new MovablePoint(0, 0,0,0);

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft.x = x1;
        topLeft.y = y1;
        bottomRight.x = x2;
        bottomRight.y = y2;
        topLeft.xSpeed = xSpeed;
        topLeft.ySpeed = ySpeed;
        bottomRight.xSpeed = xSpeed;
        bottomRight.ySpeed = ySpeed;
    }

    public String toString(){
        return "Movable rectangle, top left coordinates: (" + topLeft.x + ", " + topLeft.y +
                "), bottom right coordinates: (" + bottomRight.x + ", " + bottomRight.y + "), speed: ("
                + bottomRight.xSpeed + ", " + bottomRight.ySpeed + ")";
    }
    public void moveUp(){
        topLeft.y = topLeft.y + topLeft.ySpeed;
        bottomRight.y = bottomRight.y + bottomRight.ySpeed;
    }
    public void moveDown(){
        topLeft.y = topLeft.y - topLeft.ySpeed;
        bottomRight.y = bottomRight.y - bottomRight.ySpeed;
    }
    public void moveLeft(){
        topLeft.x = topLeft.x - topLeft.xSpeed;
        bottomRight.x = bottomRight.x - bottomRight.xSpeed;
    }
    public void moveRight(){
        topLeft.x = topLeft.x + topLeft.xSpeed;
        bottomRight.x = bottomRight.x + bottomRight.xSpeed;
    }
    public boolean checkSpeed() {
        return (topLeft.xSpeed == bottomRight.xSpeed) && (topLeft.ySpeed == bottomRight.ySpeed);
    }
}
