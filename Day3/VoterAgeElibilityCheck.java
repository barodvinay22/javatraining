import java.util.Scanner;

public class VoterAgeElibilityCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if (age > 18) {
            System.out.println("You are  eligible to vote");
        }else{
            throw new NotEligible("You are  not eligible to vote");
        }

    }
}