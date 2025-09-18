package AssignmentSep17;
import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        // Accepting 10 numbers
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Initialize min and max with the first element
        int min = numbers[0];
        int max = numbers[0];

        // Find min and max
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Display results
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);

        sc.close();
    }
}