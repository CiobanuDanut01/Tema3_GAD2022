package src.main;

public class Country {
    private String countryName;
    private String countryContinent;

    public Country(String name, String continent){
        this.countryName = name;
        this.countryContinent = continent;
    }

    @Override
    public String toString() {
        String result;
        result = "Country: "+this.countryName+" si Continent: "+this.countryContinent;
        return result;
    }

    public String getCountryName() {
        return countryName;
    }
}
