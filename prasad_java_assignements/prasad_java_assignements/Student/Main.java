package prasad_java_assignements.Student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101);
        s1.display();
        Student s2 = new Student(102, "Prasad");
        s2.display();
        Student s3 = new Student(103, "Prasad", 85);
        s3.display();
    }
}
