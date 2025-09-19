import java.util.Scanner;

public class SumNumbersArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int[] numbers =new int[10];
        int sum =0;

        for (int i=0; i < numbers.length; i++)  {
            System.out.println("Enter numbers : " +(i + 1));
            numbers [i] = sc.nextInt();
        }

        for (int i=0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("sum of 10 numbers: " + sum) ;

    }

}
