package Java_Assignment_Sep16;
public class SwapWithThirdVar {
    public static void main(String[] args) {
        // Check if two arguments are provided
        if (args.length < 2) {
            System.out.println("Please provide two numbers as arguments.");
            return;
        }

        // Take input from method arguments
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println();
        System.out.println("Before swapping:");
        System.out.println("First number : " + a);
        System.out.println("Second number: " + b);

        // Swap using a third variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println();
        System.out.println("After swapping:");
        System.out.println("First number : " + a);
        System.out.println("Second number: " + b);
    }
}