//package pr;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        int a =0;
        int b = 0;
        System.out.println("Please enter two numbers:");
        Scanner sc =new Scanner(System.in);// in is an object of input stream
        a = sc.nextInt();
        b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.printf("Swapped numbers are %d and %d\n",a,b);
    }
}
