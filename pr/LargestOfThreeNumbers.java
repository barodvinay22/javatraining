//package pr;
import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
       int a = 0;
       int b = 0;
       int c = 0;
       System.out.println("Please enter 3 numbers: ");
       Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if ( a > b && a > c) {
            System.out.printf("a is greatest %d\n",a);
        } else if (b > a && b > c) {
            System.out.printf("b is greatest %d\n", b);
        } else {
            System.out.printf("c is greatest %d\n",c);
        }
    }
}
