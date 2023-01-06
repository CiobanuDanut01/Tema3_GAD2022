package src.main;

public class Adress {
    private Country country;
    private String city;

    public Adress(Country country, String city){
        this.country = country;
        this.city=city;
    }

    @Override
    public String toString() {
        String result;
        result = "Adress in tara+continent: "+this.country+" si orasul: "+this.city+ "\n\n";
        return result;
    }
}
