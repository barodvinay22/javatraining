//package pr2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CountryCodes {
    private String CountryName;
    private String CountryCode;

    public CountryCodes(String name, String code)
    {
        this.CountryName = name;
        this.CountryCode = code;
    }
    public String getCountryName()
    {
        return this.CountryName;
    }

    public String getCountryCode()
    {
        return this.CountryCode;
    }

    @Override
    public String toString()
    {
        return "CountryCodes(CountryName : " + this.CountryName + " , CountryCode : " + this.CountryCode + ")";
    }

    public static void main(String [] args)
    {
       List<CountryCodes> ccs = new ArrayList<CountryCodes>();
        ccs.add(new CountryCodes("United States","US"));

        ccs.add(new CountryCodes("Albania","AL"));
        ccs.add(new CountryCodes("United Kingdom","UK"));
        ccs.add(new CountryCodes("Germany","DE"));
        ccs.add(new CountryCodes("India","IN"));

        Collections.sort(ccs, Comparator.comparing(CountryCodes::getCountryCode).thenComparing(CountryCodes::getCountryName));
        System.out.println(ccs);
    }
}
