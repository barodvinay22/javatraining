
import  java.util.Scanner;

public class PalindromeVowelConsonant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase();

        String reversed = new StringBuilder(input).reverse().toString();
        if (input.equals(reversed)) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }


        int vowels = 0, consonants = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {  // only check letters
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }


        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);

        sc.close();
    }
}

