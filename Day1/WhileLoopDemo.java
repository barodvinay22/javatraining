import java.util.Scanner;

public class WhileLoopDemo {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
          int number = input.nextInt();
//        for(int i=1;i<=10;i++){// int i=1 it execute only 1 time
//            System.out.println(number+"*"+i+"="+(number*i));
//        }
        int i=1;
        while(i<=10){
            System.out.println(number+"*"+i+"="+(number*i));
            i++;
        }

    }
}