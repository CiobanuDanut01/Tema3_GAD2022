package src.main;

import java.util.List;

public class Hobby {
    private String nameHobby;
    private int freq;
    private List<Adress> adressList;

    public Hobby(String name, int freq, List<Adress> list){
        this.nameHobby = name;
        this.freq = freq;
        this.adressList = list;
    }

    @Override
    public String toString() {
        String result;
        result = "Hobby cu numele: "+this.nameHobby+" si frecventa de: "+this.freq+" si lista de adrese:"+this.adressList+"";
        return result;
    }
}
