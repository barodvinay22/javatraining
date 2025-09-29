package AssignmentSep17;
public class Addition {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {

        Addition addition = new Addition();
        System.out.println("add(1, 2) = " + addition.add(1, 2));
        System.out.println("add(1, 2, 3) = " + addition.add(1, 2, 3));
        System.out.println("add(1, 2, 3, 4) = " + addition.add(1, 2, 3, 4));
    }
}
