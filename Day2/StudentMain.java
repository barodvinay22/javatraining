public class StudentMain {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setRollNumber(101);
        s1.setName("Rahul");
        System.out.println(s1);
        Student s2=new Student();
        s2.setRollNumber(101);
        s2.setName("Kunal");
        Student s3=s1;
        if(s1== s2){
            System.out.println("Reference is equals");
        }else{
            System.out.println("Reference not equals");
        }
//        if(s1.equals(s2)){
//            System.out.println("Student is the same");
//        }else {
//            System.out.println("Student is not the same");
//        }
//        Integer a=10;
//        Integer b=10;
//        if(a.equals(b)){
//            System.out.println("Value is the same");
//        }else
//            System.out.println("Value is not the same");
   }
}