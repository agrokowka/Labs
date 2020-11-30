import java.util.LinkedList;
import java.util.Scanner;

public class LabClass {
    private final LinkedList<Student> Students = new LinkedList<>();

    public void setArray() {
        for (int i = 0; i < 5; i++) {
            Scanner in = new Scanner(System.in);
            System.out.print("Student: ");
            String name = in.nextLine();
            System.out.print("Grade: ");
            int grade = in.nextInt();
            Students.add(new Student(name, grade));
        }
    }

    public void sortList() {
        Students.sort(Student::compareTo);
    }

    public String find(String name) {
        for (Student member : Students) {
            if (member.getName().equals(name)) {
                return member.getName() + ", grade " + member.getGrade();
            }
        }
        try {
            throw new StudentNotFoundException();
        } catch (StudentNotFoundException e) {
            System.out.println("Error: Student not found.");
        }
        return "";
    }

    public void outStudents() {
        for (Student student : Students) {
            System.out.println(student);
        }
    }

    public static void main (String[] args) throws StudentNotFoundException {
        LabClass pupil = new LabClass();
        pupil.setArray();
        pupil.sortList();
        pupil.outStudents();

        Scanner insert = new Scanner (System.in);
        System.out.print("Students name to find: ");
        String pupilName = insert.nextLine();
        System.out.println(pupil.find(pupilName));
    }
}
