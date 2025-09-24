package AssignmentSep24_StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class StudentMain {
    public static void main(String[] args) {
        // 1. Student data
        List<Student> studentList = Arrays.asList(
                new Student(101, "Alice", "Bio", 85),
                new Student(102, "Bob", "Phy", 65),
                new Student(103, "Charles", "Bio", 95),
                new Student(104, "David", "Che", 85),
                new Student(101, "Kim", "Bio", 90) // Duplicate rollNo
        );

        // 2. Remove duplicates based on RollNo
        List<Student> uniqueStudents = studentList.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.toCollection(() ->
                                new TreeSet<>(Comparator.comparingInt(s -> s.rollNo))),
                        ArrayList::new ));

        // 3. Sort by marks descending
        List<Student> sortedByMarks = uniqueStudents.stream()
                .sorted(Comparator.comparingInt(Student::getMarks).reversed())
                .collect(Collectors.toList());
        System.out.println("Students sorted by marks (highest first):");
        sortedByMarks.forEach(System.out::println);

        // 4. Group by course
        Map<String, List<Student>> groupedByCourse = sortedByMarks.stream()
                .collect(Collectors.groupingBy(s -> s.course));
        System.out.println("\nStudents grouped by course:");
        groupedByCourse.forEach((course, students) -> {
            System.out.println("Course: " + course);
            students.forEach(s -> System.out.println("  " + s));
        });

        // 5. Display names of students with marks > 75
        System.out.println("\nStudents with marks > 75:");
        sortedByMarks.stream()
                .filter(s -> s.marks > 75)
                .map(s -> s.name)
                .forEach(System.out::println);
    }
}