import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        System.out.println("Enter first Integer");
        Scanner sc = new Scanner(System.in);// in is an object of input stream
        int a = sc.nextInt();
        System.out.println("Enter second Integer");
        Scanner sc1 = new Scanner(System.in);// in is an object of input stream
        int b = sc1.nextInt();
        System.out.println("Enter third Integer");
        Scanner sc2 = new Scanner(System.in);// in is an object of input stream
        int c = sc1.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("largest number is = " + a);
            }else{
                System.out.println("largest number is = " + c);
            }
        } else {
            if (b > c) {
                System.out.println("largest number is = " + b);
            }else{
                System.out.println("largest number is = " + c);
            }
        }


    }
}