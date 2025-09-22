package Java_assignment_Preethi;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String inString;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any word or sentence of your choice");
        inString = sc.nextLine().toLowerCase().replaceAll("\\s+", "");
        String reverseString= "";
        for (int i=inString.length()-1;i>=0;i--){
            reverseString = reverseString + inString.charAt(i);
        }
        if (inString.equals(reverseString)) {
            System.out.println("The input statement or word is a palindrome");
        } else {
            System.out.println("The input statement or word is not a palindrome");
        }

    }
}
