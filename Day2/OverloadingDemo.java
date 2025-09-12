public class OverloadingDemo {
    static void sum(int a, int b){// Method name is same
        System.out.println(a+b);
    }
    static void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        sum(1,2);
        sum(1,2,3);
    }


    // Concept of overloading and overriding is know is polymorphism
}