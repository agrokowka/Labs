public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center = new MovablePoint(0, 0, 0, 0);

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        center.x = x;
        center.y = y;
        center.ySpeed = ySpeed;
        center.xSpeed = xSpeed;
    }

    public String toString(){
        return "Movable circle, center coordinates: (" + center.x + ", " + center.y + "), radius: " + radius +
                ", speed: (" + center.xSpeed + ", " + center.ySpeed + ")";
    }
    public void moveUp(){
        center.y = center.y + center.ySpeed;
    }
    public void moveDown(){
        center.y = center.y - center.ySpeed;
    }
    public void moveLeft(){
        center.x = center.x - center.xSpeed;
    }
    public void moveRight(){
        center.x = center.x + center.xSpeed;
    }
}
