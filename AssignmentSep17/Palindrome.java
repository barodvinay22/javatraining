package AssignmentSep17;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        boolean isPalindrome = true;

        // Loop from start till end of the string 1 char using a for loop
        for (int i = 0; i < input.length() / 2; i++) {
            // Compare character from front and back
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break; // Break the loop if a mismatch is found
            }
        }
        // Output the result
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        sc.close();
    }
}