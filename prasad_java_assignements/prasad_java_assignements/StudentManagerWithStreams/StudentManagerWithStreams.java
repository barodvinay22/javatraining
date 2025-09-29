package prasad_java_assignements.StudentManagerWithStreams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class StudentWithStreams {
    int rollNumber;
    String name;
    String course;
    int marks;

    public StudentWithStreams(int rollNumber, String name, String course, int marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return rollNumber + ", " + name + ", " + course + ", " + marks;
    }
}

public class StudentManagerWithStreams {
    public static void main(String[] args) {
        // Step 1: Store students in a list (includes duplicate rollNumber)
        List<StudentWithStreams> students = Arrays.asList(
                new StudentWithStreams(101, "Alice", "Bio", 85),
                new StudentWithStreams(102, "Bob", "Phy", 65),
                new StudentWithStreams(103, "Charles", "Bio", 95),
                new StudentWithStreams(104, "David", "Che", 85),
                new StudentWithStreams(101, "Kim", "Bio", 90) // Duplicate rollNumber
        );

        // Step 2: Remove duplicates based on rollNumber (keep first occurrence)
        Map<Integer, StudentWithStreams> uniqueStudentMap = students.stream()
                .collect(Collectors.toMap(
                        StudentWithStreams::getRollNumber,
                        Function.identity(),
                        (existing, replacement) -> existing, // Keep first occurrence
                        LinkedHashMap::new // Preserve order
                ));

        List<StudentWithStreams> uniqueStudents = new ArrayList<>(uniqueStudentMap.values());

        // Step 3: Sort students by marks (descending)
        List<StudentWithStreams> sortedByMarks = uniqueStudents.stream()
                .sorted(Comparator.comparingInt(StudentWithStreams::getMarks).reversed())
                .collect(Collectors.toList());

        System.out.println("Sorted Students by Marks (Highest First):");
        sortedByMarks.forEach(System.out::println);

        // Step 4: Group students by course
        Map<String, List<StudentWithStreams>> studentsByCourse = sortedByMarks.stream()
                .collect(Collectors.groupingBy(StudentWithStreams::getCourse));

        System.out.println("\nGrouped Students by Course:");
        studentsByCourse.forEach((course, studentList) -> {
            System.out.println(course + ":");
            studentList.forEach(s -> System.out.println("  " + s));
        });

        // Step 5: Display names of students who scored more than 75
        System.out.println("\nStudents with Marks > 75:");
        sortedByMarks.stream()
                .filter(s -> s.getMarks() > 75)
                .map(StudentWithStreams::getName)
                .forEach(System.out::println);
    }
}


