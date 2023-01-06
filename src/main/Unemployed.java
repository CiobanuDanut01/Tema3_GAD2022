package src.main;

public class Unemployed  extends Person{
    public Unemployed(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Unemployed ce contine o " + super.toString();
    }
}
