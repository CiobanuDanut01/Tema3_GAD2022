package src.main;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        String result;
        result = "Person cu nume: " + this.name + " si varsta de: "+this.age + "\n\n";
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) && age == person.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
