package AssignmentSep17;
public class StudentDetails {
    // Student Field Details
    int rollNumber;
    String name;
    int marks;

    // Constructor
    public StudentDetails(int rollNumber, String name, int marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}