package Java_assignment_Preethi;

import java.util.Scanner;

public class StudentDetails {
    private int rollnum;
    private String name;
    private int[] marks;

    public StudentDetails(int rollnum) {
        this.rollnum = rollnum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student's Rollnumber: ");
        int rollno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Student's Full Name: ");
        String name = sc.nextLine();
        System.out.println("Enter marks of Student in Math, Science and Social");
        int[] marks = new int[3];
        for(int i=0;i<marks.length;i++)
        {
            marks[i] = sc.nextInt();
        }
        StudentDetails studentDetails = new StudentDetails(rollno);
        studentDetails.setName(name);
        studentDetails.setMarks(marks);
        System.out.println("Student " + studentDetails.name + " holding rollnumber " +
                            studentDetails.rollnum + " secured " + studentDetails.marks[0] +
                            " in Math, " + studentDetails.marks[1] + " in Science & " +
                            studentDetails.marks[2] + " in Social");
    }
}
