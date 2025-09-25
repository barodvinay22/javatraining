import java.util.Scanner;

public class SumofNumbers {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers of your choice (max 10 numbers): ");
        int[] numarray = new int[10];
        int sum=0;
        for(int i:numarray){
           numarray[i]=sc.nextInt();
           sum+=numarray[i];
        }
        System.out.println("Sum of all numbers: " + sum);
    }
}
