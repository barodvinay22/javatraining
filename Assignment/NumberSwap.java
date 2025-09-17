import java.util.Scanner;

public class NumberSwap {
    public static void main(String[] args) {
        System.out.println("Enter first Integer");
        Scanner sc =new Scanner(System.in);// in is an object of input stream
        int a = sc.nextInt();
        System.out.println("Enter second Integer");
        Scanner sc1 =new Scanner(System.in);// in is an object of input stream
        int b = sc1.nextInt();
        System.out.println("Before swaping: a=" + a + ", b= " + b);
        int temp = a;
        a=b;
        b= temp;
        System.out.println("After swaping: a=" + a + ", b= " + b);
    }
}
