import java.util.Objects;

public class PersonSayan implements Comparable<PersonSayan>{
    private int id;
    private String name;

    public PersonSayan(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonSayan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    //    override of eqials method
//    public boolean equals(Object obj) ; getting an object here
//    PersonSayan personSayan = (PersonSayan) obj; typecasting a person
//    this.id is id of current person i.e. person1
//    personSayan.id is id of person2
//    if both ids of this.id and personSayan.id are same ; then return true
//    after overriding == ; it will not check memory referance , it will check value of the object
    public boolean equals(Object obj){
        PersonSayan personSayan = (PersonSayan) obj;
        if(this.id == personSayan.id){
            return true;
        }
        return super.equals(obj);
    }
//hashCode overriding
//    hashCode() method also defined in Object
//    Return an int value (the hash code of the object)
//    Used by hash based collection(HashMap , HashSet,LinkedSet) to decide the bucked where the object is saved

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(PersonSayan o) {
        return this.id - o.id;
    }
}

//contract between equals() and hashCode()
//if a.equals(b) --> then a.hashCode() == b.hashCode() must be true
//if a.hashCode() == b.hashCode() -- > then a.equasls(b) may or may not true
//if you override equals(). always override hashCode() and viceaversa.