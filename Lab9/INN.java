import java.util.Scanner;

public class INN {
    public static void main (String[] args) throws INNException {
        Scanner in = new Scanner(System.in);
        System.out.print("Insert INN: ");
        String number = in.nextLine();
        try {
            if (number.length() != 10)
                throw new INNException();
            System.out.println("Correct INN.");
        } catch (INNException err) {
            System.out.println("Error: incorrect length.");
        }
    }
}
