//package pr2;

public class OverloadingExample {

    public int add(int a , int b)
    {
        return a + b;
    }

    public int add(int a, int b , int c)
    {
        return a + b + c;
    }

    public int add(int a , int b, int c , int d)
    {
        return a + b +c +d;
    }

    public static void main(String [] args)
    {
        OverloadingExample example = new OverloadingExample();
        System.out.printf("add(%d,%d) = %d\n",1,2,example.add(1,2));
        System.out.printf("add(%d,%d,%d) = %d\n",1,2,3, example.add(1,2,3));
        System.out.printf("add(%d,%d,%d,%d) = %d\n",1,2,3,4,example.add(1,2,3,4));

    }
}

