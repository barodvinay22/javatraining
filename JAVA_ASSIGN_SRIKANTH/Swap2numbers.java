package JAVA_ASSIGN_SRIKANTH;

import java.util.Scanner;

public class Swap2numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter value of x: ");
        int x = scanner.nextInt();

        System.out.print("Enter value of y: ");
        int y = scanner.nextInt();

        // Before swapping
        System.out.println("Before Swap: x = " + x + ", y = " + y);

        // Swapping without third variable
        x = x + y;  // x now becomes 50
        y = x - y;  // y becomes 20
        x = x - y;  // x becomes 30

        // After swapping
        System.out.println("After Swap: x = " + x + ", y = " + y);
    }
}

