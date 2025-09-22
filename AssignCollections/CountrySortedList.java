import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class CountrySortedList {
    public static void main(String[]args){

//sorting of emplyees
        List<Country> country = new ArrayList<>();
        country.add(new Country(1,"India"));
        country.add(new Country(3,"Australia"));
        country.add(new Country(2,"Canada"));

        Collections.sort(country, Comparator.comparing(Country::getCode).thenComparing(Country::getName));
        System.out.println(country);
    }
}

