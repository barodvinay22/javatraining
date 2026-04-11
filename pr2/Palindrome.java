//package pr2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String [] args) {
        String str1 = "";
        Scanner sc = new Scanner(System.in);
        str1 = sc.next();
        str1 = str1.toLowerCase();
        StringBuilder bldr = new StringBuilder(str1);
        bldr.reverse();
        String str2 = bldr.toString();
        if (str2.equals(str1))
        {
            System.out.println("Its a palindrome.");
        }
        else
        {
            System.out.println("not a palindrome.");
        }
    }
}
