import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args){
        int[] arr =new int[10];// arrays index start with 0
        System.out.println("Enter 10 numbers");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){// Index
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

        for(int i:arr){// forEach
            sum+=i;
            System.out.println(i);
        }
        System.out.println("Sum of ten numbers"+sum);
    }
}