import java.util.Scanner;

public class LargeNum {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

       int largest = a;
       if (b > a)
           largest = b;
       if (c > largest)
           largest = c;

        System.out.println("Largest number is : " + largest);
       }


    }

