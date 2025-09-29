package collectionfd;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private int id;
    private String name;
    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Person person = (Person) obj;
        if(this.id == person.id){
            return true;
        }
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "[Person id= "+id+", name= "+name+"]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(Person o) {
        return this.id-o.id;
    }
}