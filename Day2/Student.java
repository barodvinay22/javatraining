import java.util.Objects;

public class Student {
    private Integer rollNumber;
    private String name;

    public Integer getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [rollNumber=" + rollNumber + ", name=" + name + "]";
    }



    @Override
    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }
        Student student = (Student) obj;
        if(this.rollNumber == student.rollNumber){
            return true;
        }
        return super.equals(obj);
    }
}