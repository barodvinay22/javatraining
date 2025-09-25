
public class SwapNumbersWithThirdVariable {

    private int num1,num2;

    //Constructor
    public SwapNumbersWithThirdVariable(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //method
    public void swap(){
        int temp;
        temp = num1;
        num1=num2;
        num2=temp;
        System.out.println("Number1: " + num1 + '\n' + "Number2: " + num2);
    }


    public static void main(String[] args){

        if (args.length != 2) {
            System.out.println("Please provide exactly two numbers");
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        SwapNumbersWithThirdVariable swapNumbers = new SwapNumbersWithThirdVariable(num1,num2);
        swapNumbers.swap();
    }
}
