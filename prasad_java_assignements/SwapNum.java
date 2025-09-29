import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) {
        System.out.println("Enter first number: ");
        Scanner sc =new Scanner(System.in);// in is an object of input stream
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Before Swap: First number: " + a + " & " + "Second number: "+ b );
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swap:  First number: " + a + " & " + "Second number: "+ b );
    }
}
