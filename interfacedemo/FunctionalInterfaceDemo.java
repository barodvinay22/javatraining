package interfacedemo;
@FunctionalInterface
public interface FunctionalInterfaceDemo {
    void readInstruction();// public abstract
    default void wirteInstruction(){

    }
}
class FunctionalInterfaceDemoImpl implements FunctionalInterfaceDemo{
    @Override
    public void readInstruction() {
        System.out.println("FunctionalInterfaceDemoImpl class");
    }
}
class FunctionalInterfaceDemoMain{
    public static void main(String[] args) {
        // First Way to implement the FunctionalInterfaceDemo
        FunctionalInterfaceDemo functionalInterfaceDemo = new FunctionalInterfaceDemoImpl();
        functionalInterfaceDemo.readInstruction();
        //Second Way to create Anonymous Inner class
        functionalInterfaceDemo = new FunctionalInterfaceDemo() {
            @Override
            public void readInstruction() {
                System.out.println("Anonymous Inner ");
            }
        };
        functionalInterfaceDemo.readInstruction();
        // Java 8 Lambda Expression
        functionalInterfaceDemo=()-> System.out.println("Java 8 Lambda Expression ");
        functionalInterfaceDemo.readInstruction();

    }
}
