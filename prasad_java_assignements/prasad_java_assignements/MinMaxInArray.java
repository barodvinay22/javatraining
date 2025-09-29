package prasad_java_assignements;

import java.util.Scanner;

public class MinMaxInArray {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numarray = new int[10];
        int max=0, min=0;
        System.out.println("Enter 10 numbers: ");
        for(int i=0;i<numarray.length;i++){
            numarray[i] = sc.nextInt();
            if (i==0) {
                min=numarray[0];
            }
            if (numarray[i] > max){
                max = numarray[i];
            }
            if (numarray[i] < min) {
                min = numarray[i];
            }

        }
        System.out.println("Minimum = " + min + "\n Maximum = " + max);
    }
}
