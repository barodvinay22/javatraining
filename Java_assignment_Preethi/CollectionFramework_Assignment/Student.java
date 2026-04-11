package Java_assignment_Preethi.CollectionFramework_Assignment;

import java.util.Objects;

public class Student implements Comparable<Student> {
    public Integer rollNumber;
    public String name;
    public String course;
    public int marks;

    public Student(Integer rollNumber, String name, String course, int marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.course = course;
        this.marks = marks;
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
        return '[' + "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", marks=" + marks + ']';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(rollNumber, student.rollNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber);
    }

    @Override
    public int compareTo(Student student) {
        if (this.marks < student.marks)
            return 1;
        else if (this.marks > student.marks)
            return -1;
        else
            return 0;
    }

}
