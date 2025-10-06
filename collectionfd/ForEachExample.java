package collectionfd;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("vinay","rakesh","akash");// Collections
        names.forEach(System.out::println);// method reference
    }
}