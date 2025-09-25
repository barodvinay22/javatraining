import java.util.Objects;

public class StudentCollectionSayan implements Comparable<StudentCollectionSayan>{
    private int rollNumer;
    private String name;
    private String course;
    private int marks;

    public StudentCollectionSayan( int rollNumer, String name, String course , int marks) {

        this.rollNumer = rollNumer;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }
    public StudentCollectionSayan(String course){
        this.course = course;
    }

    public int getRollNumer() {
        return rollNumer;
    }

    public void setRollNumer(int rollNumer) {
        this.rollNumer = rollNumer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        StudentCollectionSayan that = (StudentCollectionSayan) o;
        return rollNumer == that.rollNumer && marks == that.marks && Objects.equals(name, that.name) && Objects.equals(course, that.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumer, name, course, marks);
    }

    @Override
    public String toString() {
        return "StudentCollectionSayan{" +
                "rollNumer=" + rollNumer +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", marks=" + marks +
                '}';
    }


    @Override
    public int compareTo(StudentCollectionSayan o) {
        return this.marks - o.marks;
    }
}
