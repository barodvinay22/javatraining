package collectionfd;

public class Demo {
    public static void main(String[] args){
       Integer value1 =10; //value1==value2
       Integer value2 =10;
       if(value1.equals(value2)){
           System.out.println("Both are equals");
       }else {
           System.out.println("Both are not equals");
       }
        Person person1=new Person(1,"vinay");
        Person person2=new Person(1,"vinay");
        if(person1.equals(person2)){
            System.out.println("Same Person");
        }else{
            System.out.println("Different Person");
        }
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }
}