package Java_assignment_Preethi;

import java.util.Scanner;

public class MaxMinNumberInArray {

    public static void main(String[] args){
        int[] numarray = new int[10];
        System.out.println("Enter 10 numbers of your choice: " + '\n');
        Scanner sc = new Scanner(System.in);
        for(int i=0;i< numarray.length;i++) {
            numarray[i] = sc.nextInt();
        }
        int maxnum=numarray[0];
        int minnum=numarray[0];
        System.out.println("min" + minnum);
        for(int i:numarray) {
            maxnum=Math.max(maxnum,i);
            minnum=Math.min(minnum,i);
        }
        System.out.println("Maxnum in Array: " + maxnum + '\n' + "Minnum in Array: " + minnum);

    }

}
