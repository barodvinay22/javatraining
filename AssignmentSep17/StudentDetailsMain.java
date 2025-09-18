package AssignmentSep17;

// Main method to test the StudentDetails class
public static void StudentDetailsMain(String[] args) {
    // Creating student objects with different arguments
    StudentDetails student1 = new StudentDetails(101, "Name 1", 75);
    StudentDetails student2 = new StudentDetails(102, "Name 2", 82);
    StudentDetails student3 = new StudentDetails(103, "Name 3", 90);

    // Displaying student details
    System.out.println("Student 1 Details:");
    student1.displayDetails();

    System.out.println("\nStudent 2 Details:");
    student2.displayDetails();

    System.out.println("\nStudent 3 Details:");
    student3.displayDetails();
}