package prasad_java_assignements.Country;
import java.util.*;

public class Main {
        public static void main(String[] args) {
            List<Country> countries = new ArrayList<>();
            countries.add(new Country("IN", "India"));
            countries.add(new Country("US", "United States"));
            countries.add(new Country("UK", "United Kingdom"));
            countries.add(new Country("IN", "Indonesia"));
            countries.add(new Country("FR", "France"));

            countries.sort(Comparator
                    .comparing((Country c) -> c.code)
                    .thenComparing(c -> c.name));

            for (Country c : countries) {
                System.out.println(c);
            }
        }
}
