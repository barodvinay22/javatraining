import java.util.HashMap;
import java.util.Map;

//Map interface
//HashMap , LinkedHashMap , TreeMap
//1, 20 - represents a collection of key-value pairs(like a dictionary)
//keys are unique , value can be duplicate
//single null key is allowed inside the map
//it removes duplicate keys
public class PersonMapSayan {
    public static void main(String[] args){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,10);
        map.put(2,15);
        map.put(3,16);
        map.put(4,17);
        map.put(5,10);
        map.put(null,10);
        map.put(1,10);
        System.out.println("HashMap= " +map);
        System.out.println("Key is integer: "+map.get(2));
//        key can be anything Integer , String , Object
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("sayan",10);
        map1.put("sayan1",12);
        map1.put("sayan2",13);
        map1.put("sayan3",14);
        System.out.println("Key is string:" +map1.get("sayan1"));

    }

}
