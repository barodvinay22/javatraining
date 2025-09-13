public class StringDemo {
    public static void main(String[] args) {
        String s="Hello";// This is create a String in string constant pools Immutable class
        System.out.println(s);
        String s1=new String("Hello");// This will create our in heap more location
        if(s==s1){
       // if(s.equals(s1)){  //s.equals(s1)
            System.out.println("S And S1 are equals");
        }else{
            System.out.println("Both are not equals");
        }
        String s3="Hello";
        if(s==s3){
            System.out.println("S And S3  are equals");
        }else{
            System.out.println("S And S3 are not equals");
        }
    }
}

// int float char and double