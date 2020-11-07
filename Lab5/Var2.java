public class Var2 {
    static int printed = 0;
    public static void oneToN(int a){
        if (a == printed)
            return;
        for (int i = 1; i <= a; i++) {
            System.out.print(i + " ");
            printed++;
            oneToN(i);
        }
    }

    public static void main(String[] args){
       oneToN(2);
    }
}
