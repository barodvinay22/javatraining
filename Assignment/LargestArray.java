import java.util.Scanner;

//Arrays: * Write a program to find the maximum and minimum elements in an array.
public class LargestArray {
    public static void main(String[] args){
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 10 ; i++){
            System.out.println("Enter number: ");
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length ; i++){
            if (arr[i] < min){
                min = arr[i];
            }
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Minimum element :" +min);
        System.out.println("Maximum element :" +max);
    }
}
