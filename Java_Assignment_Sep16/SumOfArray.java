package Java_Assignment_Sep16;
import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        int sum = 0;

        // Input 10 numbers into the array
        System.out.println();
        System.out.println("Enter 10 numbers to sum:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i]; // Add each number to sum
        }

        // Display the sum of input 10 numbers
        System.out.println();
        System.out.println("The sum of the 10 numbers is: " + sum);

        sc.close();
    }
}