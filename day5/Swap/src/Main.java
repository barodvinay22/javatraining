class Student {
    int rollNumber;
    String name;
    int marks;

    // Constructor with all fields
    Student(int rollNumber, String name, String bio, int marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    // Constructor with roll number and name only
    Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = 0; // default
    }

    // Constructor with roll number only
    Student(int rollNumber) {
        this.rollNumber = rollNumber;
        this.name = "Unknown";
        this.marks = 0; // default
    }

    // Method to display student details
    void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("----------------------");
    }
}

class Calculator {
    // Method overloading for adding numbers
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}

public class Main {
    public static void main(String[] args) {
// Initializing students with different arguments
        Student s1 = new Student(101, "Alice", "Bio", 85);
        Student s2 = new Student(102, "Bob");
        Student s3 = new Student(103);

// Display details
        s1.display();
        s2.display();
        s3.display();

// Demonstrate method overloading
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 numbers: " + calc.add(1, 2));
        System.out.println("Sum of 3 numbers: " + calc.add(1, 2, 3));
        System.out.println("Sum of 4 numbers: " + calc.add(1, 2, 3, 4));
    }
}