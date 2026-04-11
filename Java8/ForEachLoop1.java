import java.util.Arrays;
import java.util.List;

public class ForEachLoop1 {
    public static void main(String[]  args){
        List<String> names = Arrays.asList("vinay" , "rakesh", "john");
        names.forEach(System.out::println);
//this is java 8 of writing for each loop
    }
}
