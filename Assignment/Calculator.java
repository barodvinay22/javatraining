public class Calculator {

    public int add(int a , int b){
        return a + b ;
    }
    public int add(int a , int b , int c){
        return  a + b +c;
    }
    public  double add(double a , double b){
        return a + b;
    }

    public static void main(String[] args){
        Calculator calc = new Calculator();
        System.out.println("Sum of two values "  + calc.add(1,2));
        System.out.println("Sum of three values "  + calc.add(1,2, 3));
        System.out.println("Sum of two doubles "  + calc.add(1.1,2.2));
    }
}
