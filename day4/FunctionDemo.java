public class FunctionDemo {
    public static void main(String[] args) {
        fun1();
    }
    static void fun1(){
        fun2();
    }
    static void fun2(){
        System.out.println("fun2");
    }
}