package Java_assignment_Preethi.CollectionFramework_Assignment;


public class CountryDetails implements Comparable<CountryDetails> {
    public Integer code;
    public String countryName;

    public CountryDetails(Integer code, String countryName) {
        this.code = code;
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "CountryDetails{" +
                "code=" + code +
                ", countryName='" + countryName + '\'' +
                '}';
    }

    @Override
    public int compareTo(CountryDetails countryDetails) {
        return this.code-countryDetails.code;
    }
}
