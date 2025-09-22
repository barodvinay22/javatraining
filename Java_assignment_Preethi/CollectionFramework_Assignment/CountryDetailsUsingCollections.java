package Java_assignment_Preethi.CollectionFramework_Assignment;

import java.util.*;

public class CountryDetailsUsingCollections {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int countryCode;
        String countryName;
        System.out.println("Enter the count of Country details you want to store");
        int count = sc.nextInt();
        List<CountryDetails> countryList = new ArrayList<>();
        for (int i=0;i<count;i++) {
            System.out.println("\nEnter the details for country #" +  (i+1) + ":");
            System.out.println("Enter country code:");
            countryCode = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter country name:");
            countryName = sc.nextLine().trim();
            countryList.add(new CountryDetails(countryCode,countryName));
        }

        System.out.println("\n====Countries List====");
        Collections.sort(countryList);
        System.out.println(countryList);

    }
}
