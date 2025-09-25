package AssignmentSep19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CountryMain {
    public static void main(String[] args) {
        // Create a list of countries
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("IN", "India"));
        countries.add(new Country("US", "United States"));
        countries.add(new Country("AU", "Australia"));
        countries.add(new Country("JP", "Japan"));
        countries.add(new Country("CN", "China"));

        // Sort countries by code (using Comparable)
        Collections.sort(countries);
        System.out.println("Countries sorted by code and name:");
        for (Country country : countries) {
            System.out.println(country);
        }

        // Sorting countries by name using a custom Comparator
        countries.sort(Comparator.comparing(Country::getName));
        System.out.println("\nCountries sorted by name:");
        for (Country country : countries) {
            System.out.println(country);
        }
    }
}
