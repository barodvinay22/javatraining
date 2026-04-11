//equals() method
//Defined in object class
//used to check if two objects are logically equal
//Some implementation maintain order , other's not
//advantages of wrapper class is , it can use methods
public class DemoSayan {
    public static void main(String[] args){
        Integer value1 = 10;
        Integer value2 = 10;
        if(value1.equals(value2)){
            System.out.println("Both are equals");
        }else{
            System.out.println("Both are not equals");
        }
        PersonSayan person1 = new PersonSayan(1,"sayan");
        PersonSayan person2 = new PersonSayan(1,"sayan");
        if(person1.equals(person2)){
            System.out.println("Both are equal person");
        }else {
            System.out.println("Different person");
        }
//        it will display "Different person" , as both objects are indicating different memory location
//        as equal method override does not happen in person class
//        PersonSayan person1 = new PersonSayan(1,"sayan"); different object ; different memory referance
//        PersonSayan person2 = new PersonSayan(1,"sayan");different object ; different memory referance
//        PersonSayan person1 = new PersonSayan(1,"sayan"); same object ; same memory referance
//        PersonSayan person2 = person1; same object ; same memory referance
    }
}
