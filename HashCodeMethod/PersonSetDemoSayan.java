import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//property of set is that it will remove duplicate values automatically
//HashSet does not retain the insertion order

public class PersonSetDemoSayan {
    public static void main(String[] args){
        Set<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(1);
        System.out.println("HashSet: " +integers);
        Set<PersonSayan> persons = new HashSet<>();
        persons.add(new PersonSayan(1,"Sayan"));
        persons.add(new PersonSayan(1,"Sayan"));
        persons.add(new PersonSayan(1,"Sayan"));
        persons.add(new PersonSayan(1,"Sayan"));
        System.out.println("HashSet: " +persons);
//        System.out.println(persons); will display 4 persons if equals and hashCode both fouctions are not overriden
//        System.out.println(persons); will display 1 person if equals and hashCode both fouctions are overriden
//        Always use Generate option and override equals and hashCode() method together

// property of set is that it will remove duplicate values automatically
//LinkedHashSet does not retain the insertion order
        Set<Integer> integers1 = new LinkedHashSet<>();
        integers1.add(1);
        integers1.add(3);
        integers1.add(2);
        integers1.add(1);
        System.out.println("linkedHashSet: " +integers1);

//   property of set is that it will remove duplicate values automatically
//        it will store object is sorted order
        Set<Integer> integers2 = new TreeSet<>();
        integers2.add(1);
        integers2.add(4);
        integers2.add(3);
        integers2.add(1);
        System.out.println("TreeSet: " +integers2);
//      use comparable to sort the objects;  public class PersonSayan implements Comparable<PersonSayan>
//@Override
//    public int compareTo(PersonSayan o) {
//        return this.id - o.id;
//    }
//
        Set<PersonSayan> persons3 = new TreeSet<>();
        persons3.add(new PersonSayan(1,"Sayan"));
        persons3.add(new PersonSayan(3,"Sayan1"));
        persons3.add(new PersonSayan(2,"Sayan2"));
        persons3.add(new PersonSayan(1,"Sayan"));
        System.out.println("TreeSet: " +persons3);
    }
}
