public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setRollNumber(1001);
        student.setName("Jack");
        System.out.println("Name of the student="+student.getName());
        System.out.println("Roll Number of the student="+student.getRollNumber());
    }
}