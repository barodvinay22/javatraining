public class SwapNum2 {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);


        int temp = a;
        a = b ;
        b = temp;

        System.out.println("swap numbers: a= " +a + ", b= "+b);

    }
}
