package AssignmentSep17;
public class StudentDetails {
    // Fields
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

    // Main method to test the StudentDetails class
    public static void main(String[] args) {
        // Creating student objects with different arguments
        StudentDetails student1 = new StudentDetails(101, "Name 1", 84);
        StudentDetails student2 = new StudentDetails(102, "Name 2", 71);
        StudentDetails student3 = new StudentDetails(103, "Name 3", 90);

        // Displaying student details
        System.out.println("Student 1 Details:");
        student1.displayDetails();

        System.out.println("\nStudent 2 Details:");
        student2.displayDetails();

        System.out.println("\nStudent 3 Details:");
        student3.displayDetails();
    }
}