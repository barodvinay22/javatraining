import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// Creating a program to sum 10 integer using List
public class BaseTypeReferenceDemo {
    public static void main(String[] args){
       List<Integer> list = new ArrayList<>();// Interger list Performace is not good
        list = new LinkedList<>();
       Scanner sc = new Scanner(System.in);//
//        sc.next();
//        sc.nextLine();
//        sc.nextInt()
//                sc.nextFloat()
//                        sc.nextDouble();
       System.out.println("Enter 10 numbers");//
       for(int i=0;i<10;i++){
           list.add(sc.nextInt());//It takes integer argument next
       }
       System.out.println(sum(list));
    }
   static Integer sum(List<Integer> list){
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        return sum;
   }
}