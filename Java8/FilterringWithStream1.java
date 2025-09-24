import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterringWithStream1 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenNumbers = new ArrayList<>();
        for(Integer i:list){
            if(i%2 == 0){
                evenNumbers.add(i);
//                here adding even numbers to output array evenNumbers
            }
        }
        System.out.println(evenNumbers);
//java8 of writing using stream
//        stream api is supported by java and it is default in collection
//        stream api has multiple intermediate operation ; one of those is filter
//        withing filter() wil pass lambda operation ; filter(Integer i-> i%2==0)
//        collect(Collectors.toList()) is a terminal operation
        List<Integer> evenNumberList = list.stream().filter(i-> i%2 == 0).collect(Collectors.toList());
        System.out.println("java8stream : " +evenNumberList);
    }
}
