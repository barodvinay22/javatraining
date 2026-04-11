package prasad_java_assignements;
import java.util.*;

class Student {
    int rollNumber;
    String name;
    String course;
    int marks;

    public Student(int rollNumber, String name, String course, int marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }

    // Equals and hashCode based on rollNumber
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student other = (Student) obj;
        return this.rollNumber == other.rollNumber;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(rollNumber);
    }

    @Override
    public String toString() {
        return rollNumber + ", " + name + ", " + course + ", " + marks;
    }
}

public class StudentManager {
    public static void main(String[] args) {
        // Step 1: Store students in a list
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(101, "Alice", "Bio", 85));
        studentList.add(new Student(102, "Bob", "Phy", 65));
        studentList.add(new Student(103, "Charles", "Bio", 95));
        studentList.add(new Student(104, "David", "Che", 85));
        studentList.add(new Student(101, "Kim", "Bio", 90)); // Duplicate rollNumber

        // Step 2: Remove duplicates using Set (based on rollNumber)
        Set<Student> studentSet = new LinkedHashSet<>(studentList);
        List<Student> uniqueStudents = new ArrayList<>(studentSet);

        // Step 3: Sort by marks (highest first)
        Collections.sort(uniqueStudents, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s2.marks - s1.marks;
            }
        });

        System.out.println("Sorted Students by Marks (Highest First):");
        for (Student s : uniqueStudents) {
            System.out.println(s);
        }

        // Step 4: Group students by course
        Map<String, List<Student>> courseMap = new HashMap<>();
        for (Student s : uniqueStudents) {
            if (!courseMap.containsKey(s.course)) {
                courseMap.put(s.course, new ArrayList<>());
            }
            courseMap.get(s.course).add(s);
        }

        System.out.println("\nGrouped Students by Course:");
        for (String course : courseMap.keySet()) {
            System.out.println(course + ":");
            for (Student s : courseMap.get(course)) {
                System.out.println("  " + s);
            }
        }

        // Step 5: Display names of students with marks > 75
        System.out.println("\nStudents with Marks > 75:");
        for (Student s : uniqueStudents) {
            if (s.marks > 75) {
                System.out.println(s.name);
            }
        }
    }
}
