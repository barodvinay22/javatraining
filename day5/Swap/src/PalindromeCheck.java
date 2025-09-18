import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Take string input
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

// Normalize the string (optional: to ignore case and spaces)
        String original = str.replaceAll("\\s+", "").toLowerCase();

// Reverse the string
        String reversed = new StringBuilder(original).reverse().toString();

// Check palindrome
        if (original.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        scanner.close();
    }
}