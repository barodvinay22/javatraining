package Java_assignment_Preethi;

import java.util.Scanner;

public class VowelConsonantInString {
    public static void main(String[] args){
        String inString;
        int vowelcnt=0,consonantscnt=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any word or sentence of your choice");
        inString = sc.nextLine().toLowerCase();
        for (char ch:inString.toCharArray())
        {
            if(ch>='a' && ch<='z'){
                switch (ch) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        vowelcnt++;
                        break;
                    default:
                        consonantscnt++;
                }
            }
        }

        System.out.println("Input String has " + vowelcnt + " Vowels and " + consonantscnt +
                            " Consonants.");
    }
}
