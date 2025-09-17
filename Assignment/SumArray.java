import java.util.Scanner;

public class SumArray {
    public static void main(String[] args){

        int sum = 0;
        int[] arr = new int[10];
        for(int i = 0 ; i < 10 ; i++){
            System.out.println("Enter number: ");
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("Sum =" + sum);
    }
}
