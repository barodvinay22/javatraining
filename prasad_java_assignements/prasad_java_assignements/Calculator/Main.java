package prasad_java_assignements.Calculator;

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println("add(1,2): " + calc.add(1, 2));
        System.out.println("add(1,2,3): " + calc.add(1, 2, 3));
        System.out.println("add(1,2,3,4): " + calc.add(1, 2, 3, 4));
    }
}
