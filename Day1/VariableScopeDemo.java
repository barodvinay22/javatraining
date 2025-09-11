public class VariableScopeDemo {
    static int test;// static variable Scope
    static {
        int variable1=10;
        System.out.println("Inside Static Block"+variable1);
        test=10;
    }
    {
        int variable2=20;
        System.out.println("Inside Instance Block"+variable2);
    }
    public static void main(String[] args) {
        {
            int a=10;
            System.out.println("Inside main");
        }
        System.out.println(args[0]);
        System.out.println("Value of test Variable"+test);
        test();
    }
    public static void test(){
       // System.out.println("Inside test"+args[0]);
        System.out.println("Inside test Method, Value of variable="+test);
    }
}