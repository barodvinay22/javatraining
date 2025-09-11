package Day1;

public class StaticDemo {
    static{
        System.out.println("Inside Static");
    }
    {
        System.out.println("Instance Block");
    }

    public static void main(String... a){
        System.out.println("Inside Main");
    }
}