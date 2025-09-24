package AssignmentSep22;

import java.util.*;
import java.util.stream.Collectors;

public class StudentMain {
    public static void main(String[] args) {

        // Step 1: Store students in a List
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(101, "Alice", "Bio", 85));
        studentList.add(new Student(102, "Bob", "Phy", 65));
        studentList.add(new Student(103, "Charles", "Bio", 95));
        studentList.add(new Student(104, "David", "Che", 85));
        studentList.add(new Student(101, "Kim", "Bio", 90)); // Duplicate rollNo

        // Step 2: Remove duplicates using Set (based on rollNo)
        Set<Student> studentSet = new HashSet<>(studentList);

        // Step 3: Sort students by marks (highest first)
        List<Student> sortedStudents = new ArrayList<>(studentSet);
        sortedStudents.sort((s1, s2) -> Integer.compare(s2.marks, s1.marks));

        System.out.println("\nSorted Students by Marks (Highest First)");
        for (Student s : sortedStudents) {
            System.out.println(s);
        }

        // Step 4: Group students by course
        Map<String, List<Student>> courseGroups = sortedStudents.stream()
                .collect(Collectors.groupingBy(s -> s.course));

        System.out.println("\nStudents Grouped by Course");
        for (String course : courseGroups.keySet()) {
            System.out.println("Course: " + course);
            for (Student s : courseGroups.get(course)) {
                System.out.println("  " + s);
            }
        }

        // Step 5: Display names of students with marks > 75
        System.out.println("\nStudents with Marks > 75");
        sortedStudents.stream()
                .filter(s -> s.marks > 75)
                .map(s -> s.name)
                .forEach(System.out::println);
    }
}