//Functional interface has exactly one abstract method ; for lambda expression in java 8
//Example - runnable , comparator
@FunctionalInterface
public interface FunctionalInterfaceSayan {
    void readInstruction(); //bydeafault it is public abstract
//    void writeInstruction(); it will give error with @FunctionalInterface , as it should have only one abstruct methos
 default void writeInstruction(){

 }
}
class FunctionalInterfaceSayanImpl implements FunctionalInterfaceSayan{
    public void readInstruction(){
        System.out.println("FunctionalInterfaceSayan class");
    }
}
class FunctionalInterfaceSayanMain{
    public static void main(String[] args){
//first way to implement FunctionalInterfaceSayan
        FunctionalInterfaceSayan functionalInterfaceSayan = new FunctionalInterfaceSayanImpl();
        functionalInterfaceSayan.readInstruction();
//        second way is to create Anonymus Inner class i.e. class does not have a name

        functionalInterfaceSayan = new FunctionalInterfaceSayan(){
            @Override
            public void readInstruction(){
                System.out.println("Anonymus Inner");
            }
        };
        functionalInterfaceSayan.readInstruction();
//        java 8 lamda expression
        functionalInterfaceSayan=()-> System.out.println("Java 8 lambda expression");
        functionalInterfaceSayan.readInstruction();
    }
}
