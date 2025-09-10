package Day1;

import java.util.Scanner;
public class InputFromConsole {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//in is an object of Input Stream class
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        System.out.print("Enter another number: ");
        int b = input.nextInt();
        System.out.print("Sum=: "+ (a+b));
    }
}