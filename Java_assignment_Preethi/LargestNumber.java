import java.util.Scanner;

public class LargestNumber {

    private int Largest(int num1, int num2, int num3){
        return Math.max(num1, Math.max(num2,num3));
//        int largestnum;
//        if(num1 > num2 & num1 > num3)
//            largestnum = num1;
//        else if (num2 > num3)
//            largestnum = num2;
//        else
//            largestnum = num3;
//
//        return largestnum;
    }
    public static void main(String[] arg) {    //input from console
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers of your choice");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        LargestNumber largestNumber = new LargestNumber();
        int largestnumber = largestNumber.Largest(num1,num2,num3);
        System.out.println("Greatest of three numbers " + num1 + ", " + num2 + ", " +
                num3 + " is: " + largestnumber);

    }
}
