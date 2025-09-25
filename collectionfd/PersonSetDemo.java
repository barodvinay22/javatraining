package collectionfd;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PersonSetDemo {
    public static void main(String[] args) {
        Set<Integer> integers = new TreeSet<>();
        integers.add(1);
        integers.add(3);
        integers.add(2);
        integers.add(1);
        System.out.println(integers);

        Set<Person> persons = new TreeSet<>();//It will store the elements in stored form
        persons.add(new Person(1,"vinay"));
        persons.add(new Person(3,"rakesh"));
        persons.add(new Person(2,"akshat"));
        persons.add(new Person(1,"vinay"));
        System.out.println(persons);
    }
}