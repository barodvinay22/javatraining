import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        System.out.println("Enter 2 integers for swapping");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //Before Swap
        System.out.println("Before swap");
        System.out.println("a = "+ a + ", b = " + b );
        a = a + b;
        b = a - b;
        a = a - b;

        //After swap
        System.out.println("After swap");
        System.out.println("a = " + a + ", b= " + b);
    }

}
