package Java_assignment_Preethi.CollectionFramework_Assignment;

import java.util.*;

public class StudentDetailsCollection {

    public static void main(String[] args){

        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Alice","Bio",85));
        students.add(new Student(102,"Bob","Phy",65));
        students.add(new Student( 103,"Charles","Bio",95));
        students.add(new Student(104,"David","Che",85));
        students.add(new Student(101,"Kim","Bio",90));

        System.out.println("Student Details List: " + "\n" + students);

        List<Student> uniqueStudentsList = new ArrayList<>();
        //get unique elements
        for (Student student : students) {
            if (!uniqueStudentsList.contains(student)){
                uniqueStudentsList.add(student);
            }
        }

        System.out.println("\nUnique Student Details List: " + "\n" + uniqueStudentsList);

        //sort on marks (desc)
        Collections.sort(uniqueStudentsList);
        System.out.println("\nStudent list with highest marks Student at top of List: " + "\n" + uniqueStudentsList);

        //Group the Student with course
        Map<String, List<Student>> courseMap = new HashMap<>();
        for (Student s : uniqueStudentsList){
            String course = s.course;
            if(!courseMap.containsKey(course)){
                courseMap.put(course, new ArrayList<>());
            }
            courseMap.get(course).add(s);
        }

        System.out.println("\nStudent Grouped by course: ");
        for (String course : courseMap.keySet()){
            System.out.println("Course: " + course);
            List<Student> group = courseMap.get(course);
            for (Student s : group) {
                System.out.println(s);
            }
        }

        //Display all students who scored more than 75 marks
        System.out.println("\nStudents who scored more than 75 marks: ");
        for (Student student : uniqueStudentsList) {
            if (student.marks > 75)
                System.out.println(student.name);
        }


    }
}
