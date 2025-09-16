public class ThrowExample {
    public static void main(String[] args){
        try{
            int a=1/0;
        }catch(ArithmeticException e){
            throw new CustomException("This is an Example of CustomException");
        }


    }
}