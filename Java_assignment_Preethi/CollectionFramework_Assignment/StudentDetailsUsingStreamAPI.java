package Java_assignment_Preethi.CollectionFramework_Assignment;

import java.util.*;
import java.util.stream.Collectors;

public class StudentDetailsUsingStreamAPI {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(101, "Alice", "Bio", 85),
                new Student(102, "Bob", "Phy", 65),
                new Student(103, "Charles", "Bio", 95),
                new Student(104, "David", "Che", 85),
                new Student(101, "Kim", "Bio", 90)
        );

        // Remove duplicates using Set (based on rollNumber)
        List<Student> uniqueStudents = new ArrayList<>(new HashSet<>(students));

        System.out.println("\nUnique Students:");
        uniqueStudents.forEach(System.out::println);

        // Sort students by marks (highest first)
        List<Student> sortedByMarks = uniqueStudents.stream()
                .sorted(Comparator.comparingInt(Student::getMarks).reversed())
                .collect(Collectors.toList());

        System.out.println("\nStudents sorted by marks (highest first):");
        sortedByMarks.forEach(System.out::println);

        // Group students by course
        Map<String, List<Student>> groupedByCourse = uniqueStudents.stream()
                .collect(Collectors.groupingBy(Student::getCourse));

        System.out.println("\nStudents grouped by course:");
        groupedByCourse.forEach((course, stuList) -> System.out.println(course + " -> " + stuList));

        //4. Display names of students with marks > 75
        List<String> highScorers = uniqueStudents.stream()
                .filter(s -> s.getMarks() > 75)
                .map(Student::getName)
                .collect(Collectors.toList());

        System.out.println("\nStudents with marks > 75:");
        highScorers.forEach(System.out::println);
    }
}
