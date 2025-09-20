package interfacedemo;

public class Student implements java.io.Serializable {
    private Integer rollNo;// int
    private String name;
    private transient String ssnNumber;
    Student(Integer rollNo, String name,String ssnNumber){
        this.rollNo = rollNo;
        this.name = name;
        this.ssnNumber = ssnNumber;
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + " SSN=" + ssnNumber + "]";
    }
}