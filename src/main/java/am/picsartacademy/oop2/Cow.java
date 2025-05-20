package am.picsartacademy.oop2;

public class Cow extends Animal {

    public Cow(String name) {
        super(name);
    }

    public Cow(String name, int age) {
        super(name, age);
    }


    @Override
    public void eat() {
        System.out.println("Cow is eating...");
    }
}
