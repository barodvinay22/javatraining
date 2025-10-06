package collectionfd;

import java.util.HashMap;
import java.util.Map;


public class PersonMap {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,20);
        map.put(2,25);
        map.put(3,28);
        map.put(4,30);
        map.put(null,40);
        map.put(1,40);
     System.out.println(map);
     System.out.println(map.get(2));

     Map<String,Integer> map1 = new HashMap<>();
     map1.put("vinay",20);
     map1.put("rakesh",25);
     map1.put("Rajesh",28);
     System.out.println(map1.get("vinay"));

    }
}