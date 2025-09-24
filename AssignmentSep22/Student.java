package AssignmentSep22;

import java.util.*;
import java.util.stream.Collectors;

// Student class with overridden equals and hashCode for Set
class Student {
    int rollNo;
    String name;
    String course;
    int marks;

    public Student(int rollNo, String name, String course, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }

    // Override equals and hashCode based on rollNo
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", marks=" + marks +
                '}';
    }
}