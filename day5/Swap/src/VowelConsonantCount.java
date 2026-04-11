import java.util.Scanner;

public class VowelConsonantCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Take input
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

// Convert to lowercase to simplify checks
        str = str.toLowerCase();

        int vowels = 0, consonants = 0;

// Loop through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

// Check if alphabet
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

// Output results
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);

        scanner.close();
    }
}