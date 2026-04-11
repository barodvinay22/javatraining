package prasad_java_assignements;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println("Enter String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int length = str.length();
        boolean isPalindrome = true;
        for (int i = 0; i < length/ 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
            if (isPalindrome) {
                System.out.println(str + " is a Palindrome");
            } else {
                System.out.println(str + " is not a Palindrome");
            }
    }
}
