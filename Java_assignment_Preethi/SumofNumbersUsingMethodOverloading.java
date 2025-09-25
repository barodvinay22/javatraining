package Java_assignment_Preethi;

import java.util.Scanner;

public class SumofNumbersUsingMethodOverloading {

    public int addNumbers(int num1, int num2){
        return num1+num2;
    }
    public int addNumbers(int num1, int num2, int num3){
        return num1+num2+num3;
    }
    public int addNumbers(int num1, int num2, int num3, int num4){
        return num1+num2+num3+num4;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers of your choice to add");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        SumofNumbersUsingMethodOverloading sumOfNumbers = new SumofNumbersUsingMethodOverloading();
        System.out.println("Sum of two numbers is: " + sumOfNumbers.addNumbers(num1,num2));
        System.out.println("Enter third number to add to previous sum");
        int num3=sc.nextInt();
        System.out.println("Sum of three numbers is: " + sumOfNumbers.addNumbers(num1,num2,num3));
        System.out.println("Enter fourth number to add to previous sum");
        int num4=sc.nextInt();
        System.out.println("Sum of all four numbers is: " + sumOfNumbers.addNumbers(num1,num2,num3,num4));

    }

}
