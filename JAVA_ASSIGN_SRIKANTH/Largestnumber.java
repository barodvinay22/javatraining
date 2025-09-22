package JAVA_ASSIGN_SRIKANTH;


import java.util.Scanner;

    public class Largestnumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Taking input from console
            System.out.print("Enter first number: ");
            int a = scanner.nextInt();

            System.out.print("Enter second number: ");
            int b = scanner.nextInt();

            System.out.print("Enter third number: ");
            int c = scanner.nextInt();

            // Finding the largest number
            int largest;
            if (a >= b && a >= c) {
                largest = a;
            } else if (b >= a && b >= c) {
                largest = b;
            } else {
                largest = c;
            }

            // Output the result
            System.out.println("The largest number is: " + largest);
        }
    }
