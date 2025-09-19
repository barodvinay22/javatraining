package collectionframeworkdemo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set set = new HashSet();// Raw Type
        set.add("a");
        set.add("b");
        set.add("a");
        set.add(new Employee(1));
        set.add(new Employee(1));
        System.out.println(set);
        Set<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(1);
        integers.add(1);
        integers.add(1);

        System.out.println(integers);
    }
}