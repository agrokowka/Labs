import java.util.LinkedList;
import java.util.Scanner;

public class DoubleListGame {
    private static final LinkedList<Integer> player1 = new LinkedList<>();
    private static final LinkedList<Integer> player2 = new LinkedList<>();

    public static int i = 0;

    public static void preparation() {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 5; i++)
            player1.addLast(in.nextInt());
        for (int i = 0; i < 5; i++)
            player2.addLast(in.nextInt());
    }

    public static void play() {
        if (player1.isEmpty()) {
            System.out.println("Second " + i);
            return;
        }
        if (player2.isEmpty()) {
            System.out.println("First " + i);
            return;
        }
        if (i == 105) {
            System.out.println("Botva");
            return;
        }

        i++;

        if (((player1.peek() == 0) & (player2.peek() == 9))) {
            player1.addLast(player1.pop());
            player1.addLast(player2.pop());
            play();
        } else if ((player2.peek() == 0) & (player1.peek() == 9)){
            player2.addLast(player1.pop());
            player2.addLast(player2.pop());
            play();
        } else if (player1.peek() > player2.peek()) {
            player1.addLast(player1.pop());
            player1.addLast(player2.pop());
            play();
        } else if (player2.peek() > player1.peek()) {
            player2.addLast(player1.pop());
            player2.addLast(player2.pop());
            play();
        }
    }

    public static void main (String[]args) {
        preparation();
        play();
    }
}
