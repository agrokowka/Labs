package Lab1;

public class TestBall {
    public static void main(String[] args){
        Ball b1 = new Ball("football", 3, "yellow");
        Ball b2 = new Ball();
        Ball b3 = new Ball(4, "blue");

        b2.setColor("black");
        b2.setSize(2);
        b2.setType("basketball");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
