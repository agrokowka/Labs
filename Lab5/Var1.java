import java.util.Scanner;

public class Var1 {
    static int j = 1;
    static int printed = 0;
    static int number;
    Scanner in = new Scanner(System.in);

   public static void setSequence(){
       Scanner in = new Scanner(System.in);
       number = in.nextInt();
       if( number == 1) {
           System.out.print(1);
       } else
           sequence(number);
   }

    public static void sequence(int a) {
        for (int i = 1; i < a; i++) {
            if (printed == number)
                return;
            if (i == j) {
                System.out.print(i + " ");
                printed++;
                j++;
                if (printed == number)
                    return;
                if (j == a) {
                    System.out.print(j + " ");
                    printed++;
                }
                sequence(i);
                if (printed == number)
                    return;
            }
            if (i < j) {
                System.out.print(j + " ");
                printed++;
                if (printed == number)
                    return;
            }
            if (i > j) {
                j++;
                sequence(i);
                if (printed == number)
                    return;
            }
        }
    }


    public static void main(String[] args) {
       System.out.print("Enter value: ");
        setSequence();
    }
}
