public class Sum {
    public static void main(String[] args){
        System.out.println("Number of arguments: " + args.length);
        int sum = 0;
        if (args.length > 0){
            System.out.println("Argumets received");
            for(int i = 0 ; i <args.length ; i++){
                sum = sum + Integer.parseInt(args[i]);
            }

        }else{
            System.out.println("No arguments received");
        }
        System.out.println("Sum =" + sum);
    }
}
