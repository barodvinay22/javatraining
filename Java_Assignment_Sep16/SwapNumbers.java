package Java_Assignment_Sep16;
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers to swap
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println();
        System.out.println("Before swapping:");
        System.out.println("First number : " + a);
        System.out.println("Second number: " + b);

        // Swapping without using a third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println();
        System.out.println("After swapping:");
        System.out.println("First number : " + a);
        System.out.println("Second number: " + b);

        sc.close();
    }
}