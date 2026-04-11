public class SwapNumbersUsingThirdVariable {
    public static void main(String[] args){
        if (args.length < 2) {
            System.out.println("please provide 2 numbers");
            return;
        }
        //command line argument
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        //swap using third variable
        int temp = num1;
        num1 = num2;
        num2 =  temp;

        System.out.println("After swapping: num1 = " + num1  + ", num2 = " +num2);
    }
}
