package collectionfd;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class EmployeeMain {
    public static void main(String[] args) {
        Map<Employee,Integer> map = new HashMap<>();
        Employee employee=new Employee(1,"vinay",25);
        map.put(employee,10);
        map.put(new Employee(2,"Rakesh",30),15);
        map.put(new Employee(1,"vinay",28),20);
        System.out.println(map);
         map = new LinkedHashMap<>();
        map.put(new Employee(1,"vinay",28),10);
        map.put(new Employee(2,"Rakesh",30),15);
        map.put(new Employee(1,"vinay",28),20);
        System.out.println(map);
//        map = new TreeMap<>();
//        map.put(new Employee(10,"vinay",28),10);
//        map.put(new Employee(2,"Rakesh",30),15);
//        map.put(new Employee(10,"vinay",28),20);
//        System.out.println(map);
        System.out.println(map.get(new Employee(1,"vinay",28)));
        if(map.containsKey(new Employee(10,"vinay",28))){
            System.out.println("key is present");
        }else
            System.out.println("key is not present");

        System.out.println(map.keySet());
    }
}