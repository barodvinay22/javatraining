import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//here Key is custom EmployeeSayan class and value is Integer
//need to implement hashCode and euqals method always
public class EmployeeMainSayan {
    public static void main(String[] args){
        Map<EmployeeSayan,Integer> map = new HashMap<>();
        map.put(new EmployeeSayan(1,"sayan1",30),10);
        map.put(new EmployeeSayan(1,"sayan1",30),10);
        map.put(new EmployeeSayan(1,"sayan1",30),50);
        map.put(new EmployeeSayan(2,"sayan2",30),20);
        map.put(new EmployeeSayan(3,"sayan2",40),30);
        map.put(new EmployeeSayan(4,"sayan3",40),40);
        map.put(null,10);
        System.out.println("HashMap:" +map);
//linked HashMap
//        stores the insertion sequence
        map = new LinkedHashMap<>();
        map.put(new EmployeeSayan(1,"sayan1",30),10);
        map.put(new EmployeeSayan(1,"sayan1",30),10);
        map.put(new EmployeeSayan(1,"sayan1",30),50);
        map.put(new EmployeeSayan(2,"sayan2",30),20);
        map.put(new EmployeeSayan(3,"sayan2",40),30);
        map.put(new EmployeeSayan(4,"sayan3",40),40);
        map.put(null,10);
        System.out.println("LinkedHashMap: " +map);

        //TreeMap
//        stores the insertion sequence
        map = new TreeMap<>();
        map.put(new EmployeeSayan(1,"sayan1",30),10);
        map.put(new EmployeeSayan(1,"sayan1",30),10);
        map.put(new EmployeeSayan(1,"sayan1",30),50);
        map.put(new EmployeeSayan(2,"sayan2",30),20);
        map.put(new EmployeeSayan(3,"sayan2",40),30);
        map.put(new EmployeeSayan(4,"sayan3",40),40);
        map.put(null,10);
        System.out.println("LinkedHashMap: " +map);
        System.out.println(map.get(new EmployeeSayan(1,"sayan1",30)));
//        containsKey checks whether key is presenr or not
        if (map.containsKey(new EmployeeSayan(1,"sayan1",30))){
            System.out.println("Key is present");
        }else{
            System.out.println("Key is not present");
        }
//        keySet() returns all the keys
        System.out.println(map.keySet());
    }
}
