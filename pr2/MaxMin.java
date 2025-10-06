//package pr2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        List<Integer> ilist = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: to stop enter -9999 :");
        int a = 0;
        int min = Integer.MAX_VALUE;
        int max = 0;
        while((a = sc.nextInt()) != -9999) {
                ilist.add(a);
        }
        for(int i : ilist) {
            if ( i < min ) {
                min = i;
            }
            if ( i  >  max) {
                max = i;
            }
        }

        System.out.printf("Max is %d , min is %d\n",max, min);
    }
}
