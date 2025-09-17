import java.util.Scanner;

public class SwapNumbers {

    private int num1, num2;

    //Constructor
    public SwapNumbers(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //method
    public void swap() {
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Number1: " + num1 + '\n' + "Number2: " + num2);
    }

    public static void main(String[] arg) {
        //input from console
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers of your choice");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        //object
        SwapNumbers swapNumbers = new SwapNumbers(num1,num2);
        //invoking method
        swapNumbers.swap();

    }
}
