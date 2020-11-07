import java.util.Scanner;

public class Var16 {
    public static int maxNumber(int a, int b) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int amount = b;
        int max = a;
        if (number == 0){
            return amount;
        } else if (number == max){
            amount = amount + 1;
            return maxNumber(max, amount);
        } else if (number < max){
            return maxNumber(max, amount);
        } else if (number > max){
            max = number;
            amount = 0;
            return maxNumber(max, amount);
        }
        return 0;
    }

    public static void main(String[] args){
        System.out.println(maxNumber(0,0));
    }
}