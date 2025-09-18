package collectionframeworkdemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List list=new ArrayList();// here we created reference of list and object of ArrayList
        ArrayList arrayList=new ArrayList();
        // Object type of data
        list.add(1);//0
        list.add("Hello");//1
        list.add(new Employee(1));//2
        System.out.println("Original List"+list);


        System.out.println(list.get(2));
        list.add(0,10);
        System.out.println(list.get(0));
        System.out.println("Size of list"+list.size());
        List<Integer> integers =  new ArrayList<>();// Type safety
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(0,4);
    integers.clear();
        System.out.println("Integer List Size"+integers.size());
        list.addAll(integers);
        System.out.println("Original List Added with integer"+list);
        list.remove(1);
        System.out.println("Remove List Added with integer"+list);
    }

}