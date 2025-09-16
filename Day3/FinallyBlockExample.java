public class FinallyBlockExample {
    public static void main(String[] args) {
        Integer a= null;
        try{
            if(a.equals(10)){
                System.out.println("Value of a is 10");
            }
        }finally {
            System.out.println("Inside finally block");
        }
    }
}