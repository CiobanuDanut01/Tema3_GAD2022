package src.main;

public class Student extends Person{
    public Student(String name, int age){
        super(name,age);
    }

    @Override
    public String toString() {
        return "Student ce contine o " + super.toString();
    }
}
