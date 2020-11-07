import java.util.Scanner;

public class Var17 {
    public static int maximum(int a) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int max = a;
        if (number == 0){
            return max;
        } else if (number == max){
            return maximum(max);
        } else if (number < max){
            return maximum(max);
        } else if (number > max){
            max = number;
            return maximum(max);
        }
        return 0;
    }

    public static void main(String[] args){
        System.out.println(maximum(0));
    }
}
