package src.main;

public class Employed extends Person {
    public Employed(String name, int age) {
        super(name,age);
    }

    @Override
    public String toString() {
        return "Employed ce contine o " + super.toString();
    }
}
