package JAVA_ASSIGN_SRIKANTH;

public class Swap2numwith3variable {
        public static void main(String[] args) {
            // Check if exactly two arguments are passed
            if (args.length != 2) {
                System.out.println("Please provide exactly two integer numbers as arguments.");
                return;
            }

            // Parse input arguments to integers
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            System.out.println("Before swap:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);

            // Swap using third variable
            int temp = a;
            a = b;
            b = temp;

            System.out.println("After swap:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
}
