
import java.util.Scanner;

public class SwapNumbers2 {
    public static void main(String[] args) {
        int a =0;
        int b = 0;
        int c = 0;
        System.out.println("Please enter two numbers:");
        Scanner sc =new Scanner(System.in);// in is an object of input stream
        a = sc.nextInt();
        b = sc.nextInt();
        c = a;
        a = b;
        b = c;
        System.out.printf("Swapped numbers are %d and %d\n",a,b);
    }
}
