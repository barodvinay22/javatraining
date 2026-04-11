public class StudentSayanDemo {
    public static void main(String[] args){

        StudentSayan studentSayan = new StudentSayan();
        studentSayan.setRollNumber(1001);
        studentSayan.setName("Sayan");
        studentSayan.setMarks(100);
        System.out.println("Name of the student="+studentSayan.getName());
        System.out.println("Roll Number of the student="+studentSayan.getRollNumber());
        System.out.println("Marks of the student="+studentSayan.getMarks());
    }
}
