package collectionfd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringWithStreams {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenumbers=new ArrayList<>();
        for(Integer i:list){
            if(i%2==0){
                evenumbers.add(i);
            }
        }
        System.out.println(evenumbers);

        List<Integer> evenNumberList=list.stream().filter(i-> i%2==0).collect(Collectors.toList());

    }
}