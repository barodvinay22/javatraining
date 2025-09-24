package AssignmentSep24_StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student other = (Student) o;
        return this.rollNo == other.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    @Override
    public String toString() {
        return rollNo + ", " + name + ", " + course + ", " + marks;
    }

    public int getMarks() {
        return marks;
    }
}
