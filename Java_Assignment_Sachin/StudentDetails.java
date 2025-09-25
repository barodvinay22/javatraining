package Java_Assignment_Sachin;

class Student {
    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name       : " + name);
        System.out.println("Marks      : " + marks);
        System.out.println("-------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Rahul", 85);
        Student s2 = new Student(102, "Sneha", 90);
        Student s3 = new Student(103, "Amit", 78);

        // Display details of students
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
