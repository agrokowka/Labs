public class TestMovable {
    public static void main(String[] args){
        MovablePoint p1 = new MovablePoint(0,0,1,1);
        p1.moveDown();
        System.out.println(p1);

        MovableCircle c1 = new MovableCircle(5,5, 3, 6, 4);
        System.out.println(c1);
        c1.moveRight();
        c1.moveUp();
        System.out.println(c1);

        MovableRectangle r1 = new MovableRectangle(0, 0, 6, 4, 12, 5);
        System.out.println(r1);
        System.out.println(r1.checkSpeed());
        r1.moveLeft();
        r1.moveDown();
        System.out.println(r1);
    }
}
