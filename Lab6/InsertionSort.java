import java.util.Scanner;
public class InsertionSort {
    Student[] iDNumber = new Student[5];

    public void setArray() {
        for (int i = 0; i < iDNumber.length; i++) {
            Scanner in = new Scanner(System.in);
            System.out.print("Student: ");
            String name = in.nextLine();
            System.out.print("Grade: ");
            int grade = in.nextInt();
            iDNumber[i] = new Student(name, grade);
        }
    }

    public void sort() {
        for (int i = 1; i < iDNumber.length; i++) {
            Student key = iDNumber[i];
            int j = i - 1;
            while (key.compareTo(iDNumber[j]) < 0) {
                iDNumber[j + 1] = iDNumber[j];
                j = j - 1;
                if (j == -1)
                    break;
            }
            iDNumber[j + 1] = key;
        }
    }

    public void returnStudents() {
        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }

    public static void main (String[] args){
        InsertionSort students = new InsertionSort();
        students.setArray();
        students.sort();
        students.returnStudents();
    }
}
