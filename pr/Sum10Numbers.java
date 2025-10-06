
import java.util.Scanner;

public class Sum10Numbers {
    public static void main(String[] args) {
        int a =10;
        int b = 0;
        System.out.println("Please enter 10 numbers:");
        Scanner sc =new Scanner(System.in);// in is an object of input stream
        while (a > 0) {
            b += sc.nextInt();
            a--;
        }
        System.out.printf("Sum of numbers is %d\n",b);
    }
}
