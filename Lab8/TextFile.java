import java.io.*;
import java.util.Scanner;

public class TextFile {
    public static void writeFile() throws Exception {
        System.out.println("Ввод в файл:");
        Scanner in = new Scanner(System.in);
        FileWriter writer = new FileWriter("Text.txt", true);
        writer.write(in.nextLine() + "\n");
        writer.close();
    }

    public static void rewriteFile() throws Exception {
        System.out.println("Перезапись файла:");
        Scanner in = new Scanner(System.in);
        FileWriter rewriter = new FileWriter("Text.txt", false);
        rewriter.write(in.nextLine() + "\n");
        rewriter.close();
    }

    public static void readFile() throws Exception {

        FileReader reader = new FileReader("Text.txt");
        System.out.println("Записи в файле:");
        Scanner out = new Scanner (reader);
        while (out.hasNextLine()) {
            System.out.println(out.nextLine());
        }
        reader.close();
    }

    public static void main (String[] args)  throws Exception {
        writeFile();
        readFile();
        writeFile();
        readFile();
        rewriteFile();
        readFile();
    }
}
