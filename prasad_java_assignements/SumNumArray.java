import java.util.Scanner;

public class SumNumArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] numbers =new int[10];
        int sum = 0;

        for (int i=0; i < numbers.length; i++) {

            System.out.println("Enter number: " + i );
            numbers[i] = sc.nextInt();
            sum += numbers[i];

        }
        System.out.println("Sum of 10 numbers: " +sum );
    }
}
