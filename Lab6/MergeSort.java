import java.util.Scanner;

public class MergeSort {

    public void setArray(Student[] a) {
        for (int i = 0; i < a.length; i++) {
            Scanner in = new Scanner(System.in);
            System.out.print("Student: ");
            String name = in.nextLine();
            System.out.print("Grade: ");
            int grade = in.nextInt();
            a[i] = new Student(name, grade);
        }
    }

    public Student[] sort(Student[] a) {
        if (a.length < 2){
            return a;
        }

        Student[] b = new Student[a.length / 2];
        System.arraycopy(a, 0, b, 0, a.length / 2);
        Student[] c = new Student[a.length - a.length / 2];
        System.arraycopy(a, a.length / 2, c, 0, a.length - a.length / 2);

        b = sort(b);
        c = sort(c);

        return merge(b, c);
    }

     public Student[] merge(Student[] a1, Student[] a2) {
         Student[] b = new Student[a1.length + a2.length];
        int posA1 = 0;
        int posA2 = 0;

        for (int i = 0; i < b.length; i++){
            if (posA1 == a1.length){
                b[i] = a2[posA2];
                posA2++;
            } else if (posA2 == a2.length) {
                b[i] = a1[posA1];
                posA1++;
            } else if (a1[posA1].compareTo(a2[posA2]) < 0) {
                b[i] = a1[posA1];
                posA1++;
            } else {
                b[i] = a2[posA2];
                posA2++;
            }
        }
        return b;
    }

    public void returnStudents(Student[] a) {
        for (Student student : a) {
            System.out.println(student);
        }
    }

    public static void main (String[] args) {
        Student[] iDNumber = new Student[3];
        Student[] grades = new Student[3];
        Student[] sumArrays = new Student[iDNumber.length + grades.length];

        MergeSort exams = new MergeSort();

        exams.setArray(iDNumber);
        exams.setArray(grades);

        exams.sort(iDNumber);
        exams.sort(grades);

        sumArrays = exams.merge(iDNumber, grades);
        exams.sort(sumArrays);
        exams.returnStudents(sumArrays);
    }
}
