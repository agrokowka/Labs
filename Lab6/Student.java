public class Student implements Comparable <Student> {
    private String name;
    private int grade;

    public Student (String name, int grade){
        this.name = name;
        this.grade = grade;
    }

    public Student (){
        name = " ";
        grade = 0;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setGrade(int grade){
        this.grade = grade;
    }

    public int compareTo (Student s) {
        return Integer.compare(grade, s.grade);
    }

    public String getName(){
        return name;
    }
    public int getGrade(){
        return grade;
    }
    public String toString(){
        return name + ", Оценка " + grade;
    }
}