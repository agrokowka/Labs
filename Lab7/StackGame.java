import java.util.Stack;
import java.util.Scanner;

public class StackGame {
    private static final Stack<Integer> player1 = new Stack<>();
    private static final Stack<Integer> player2 = new Stack<>();


    public static int i = 0;


    public static void preparation() {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 5; i++)
            player1.add(0, in.nextInt());
        for (int i = 0; i < 5; i++)
            player2.add(0, in.nextInt());
    }
    public static void play() {
        if (player1.empty()) {
            System.out.println("Second " + i);
            return;
        }
        if (player2.empty()) {
            System.out.println("First " + i);
            return;
        }
        if (i == 105) {
            System.out.println("Botva");
            return;
        }

        i++;

        if (((player1.peek() == 0) & (player2.peek() == 9))) {
            player1.add(0, player1.pop());
            player1.add(0, player2.pop());
            play();
        } else if ((player2.peek() == 0) & (player1.peek() == 9)){
            player2.add(0, player1.pop());
            player2.add(0, player2.pop());
            play();
        } else if (player1.peek() > player2.peek()) {
            player1.add(0, player1.pop());
            player1.add(0, player2.pop());
            play();
        } else if (player2.peek() > player1.peek()) {
            player2.add(0, player1.pop());
            player2.add(0, player2.pop());
            play();
        }
    }

    public static void main (String[]args) {
        preparation();
        play();
    }
}
