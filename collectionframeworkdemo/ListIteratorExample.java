package collectionframeworkdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> participants=new ArrayList();
        participants.add("Sachin");
        participants.add("Varad");
//        Iterator<String> stringIterator = participants.iterator();
//        while(stringIterator.hasNext()){
//            System.out.println(stringIterator.next());
//        }
//        for(int i=0;i<participants.size();i++){
//            System.out.println(participants.get(i));
//        }
//        for(String participant:participants){// temporary variable participant
//            System.out.println(participant);
//        }

        participants.stream().forEach(p->System.out.println(p));

    }
}