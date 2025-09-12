public class WrapperClassDemo {
    public static void main(String[] args){
        // int float char double --> (primitive Data Type) Java is not fully OOPL
        // Integer Flot Character Double --> Wrapper Classes
        System.out.println("Arguments"+ args[0]);
        int a = Integer.parseInt(args[0]);// OutBoxing and unboxing
        int b = Integer.parseInt(args[1]);
        int c = a+b;
        System.out.println("Sum=: "+ c);
        float f = Float.parseFloat(args[2]);
        System.out.println("Float Value=: "+ f);
        Double d = Double.parseDouble(args[3]);
        System.out.println("Double Value=: "+ d);
        // Default Package in java --> java.lang
        // Main Class -->Object

    }
}