public class HandlingOfExceptionExample {
    public static void main(String[] args) {
//        try{
//            int a = Integer.parseInt(args[0]);
//            System.out.println(a);
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("There is an exception in program");
//        }catch (NumberFormatException e){
//            System.out.println("Unable to convert String to number");
//        }

        try{
            int a = Integer.parseInt(args[0]);
            System.out.println(a);
        }catch(ArrayIndexOutOfBoundsException | NumberFormatException e){
            System.out.println(e.getMessage());
            System.out.println("There is an exception in program");
        }

    }
}