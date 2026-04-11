import java.util.*;
import java.util.stream.Collectors;

class Student1{
    int rollNumber;
    String name;
    String course;
    int marks;

    public Student1(int rollNumber, String name, String course, int marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }

    // equals and hashCode to remove duplicates by rollNumber
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return rollNumber == student.rollNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber);
    }

    @Override
    public String toString() {
        return rollNumber + " - " + name + " (" + course + "), Marks: " + marks;
    }
}

public class StudentRecords {
    public static void main(String[] args) {
// Step 1: Store students in a list
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Alice", "Bio", 85));
        students.add(new Student(102, "Bob", "Phy", 65));
        students.add(new Student(103, "Charles", "Bio", 95));
        students.add(new Student(104, "David", "Che", 85));
        students.add(new Student(101, "Kim", "Bio", 90)); // duplicate rollNumber

// Step 2: Remove duplicates using Set
        Set<Student> uniqueStudents = new HashSet<>(students);

// Step 3: Display students sorted by marks (descending)
        System.out.println("Students sorted by marks (highest first):");
        uniqueStudents.stream()
                .sorted((s1, s2) -> Integer.compare(s2.marks, s1.marks))
                .forEach(System.out::println);

// Step 4: Group students by course
        Map<String, List<Student>> courseMap = uniqueStudents.stream()
                .collect(Collectors.groupingBy(s -> s.name));

        System.out.println("\nStudents grouped by course:");
        for (Map.Entry<String, List<Student>> entry : courseMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

// Step 5: Display names of students who scored more than 75
        System.out.println("\nStudents who scored more than 75:");
        uniqueStudents.stream()
                .filter(s -> s.marks > 75)
                .forEach(s -> System.out.println(s.name));
    }
}