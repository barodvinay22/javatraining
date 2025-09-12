package Day1;// This is first statmenet

import java.util.Scanner;// This are second statmenets

public class EvenAndOddNumber {
    public static void main(String[] args) {
        System.out.println("Enter an Integer");
        Scanner sc =new Scanner(System.in);// in is an object of input stream
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
}