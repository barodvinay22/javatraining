package prasad_java_assignements.Student;

public class Student {
    int rollNumber, marks;
    String name;
    Student(int rollNumber){
        this.rollNumber=rollNumber;
        this.name="Prasad";
        this.marks=95;
    }
    Student(int rollNumber, String name){
        this.rollNumber=rollNumber;
        this.name=name;
        this.marks=90;
    }
    Student(int rollNumber, String name, int marks){
        this.rollNumber=rollNumber;
        this.name=name;
        this.marks=marks;
    }
    void display(){
        System.out.println("rollNumber: " + rollNumber + "name: " + name + "marks: " + marks);
    }
}


