import java.util.Scanner;

public class Sumofarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10]; // Array to hold 10 integers

        System.out.println("Enter 10 numbers:");

// Taking input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

// Calculating sum using for loop
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

// Display result
        System.out.println("The sum of the 10 numbers is: " + sum);

        scanner.close();
    }
}