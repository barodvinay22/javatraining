package AssignmentSep19;

class Country implements Comparable<Country> {
    private String code;
    private String name;

    // Constructor
    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    // Getters
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Country{code='" + code + "', name='" + name + "'}";
    }

    // Implementing Comparable to sort by code first, then by name
    @Override
    public int compareTo(Country other) {
        // First compare by code
        int codeComparison = this.code.compareTo(other.code);
        // If codes are equal, compare by name
        if (codeComparison == 0) {
            return this.name.compareTo(other.name);
        }
        return codeComparison;
    }
}