import java.util.Scanner;

public class SortingStudentsByGPA {
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

    public void quickSort(int low, int high) {
        if (iDNumber.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }

        int middle = low + (high - low) / 2;
        Student base = iDNumber[middle];

        int i = low;
        int j = high;
        while (i <= j) {
            while (iDNumber[i].compareTo(base) < 0) {
                i++;
            }
            while (iDNumber[j].compareTo(base) > 0) {
                j--;
            }
            if (i <= j) {
                Student temp = iDNumber[i];
                iDNumber[i] = iDNumber[j];
                iDNumber[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSort(low, j);
        }
        if (high > i) {
            quickSort(i, high);
        }
    }

    public void outStudents() {
        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }

    public static void main (String[] args){
        SortingStudentsByGPA student = new SortingStudentsByGPA();
        student.setArray();
        student.quickSort(0, 4);
        student.outStudents();
    }
}
