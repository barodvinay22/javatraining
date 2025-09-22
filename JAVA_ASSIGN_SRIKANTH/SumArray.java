package JAVA_ASSIGN_SRIKANTH;

    import java.util.Scanner;

    public class SumArray {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[] arr = new int[10];  // Array to store 10 integers
            int sum = 0;

            // Input 10 numbers
            System.out.println("Enter 10 integers:");

            for (int i = 0; i < 10; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();  // Read input into array
                sum += arr[i];              // Add to sum
            }

            // Output the result
            System.out.println("The sum of the 10 numbers is: " + sum);
        }
    }
