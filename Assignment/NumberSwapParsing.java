
public class NumberSwapParsing {
    public static void main(String[] args){

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        try{
            System.out.println(args[0]);
            System.out.println(args[1]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Before swap: a= " + a + ", b= " +b );
        int temp = a;
        a =  b;
        b = temp;
        System.out.println("After swap: a= " + a + ", b= " +b );
    }
}
