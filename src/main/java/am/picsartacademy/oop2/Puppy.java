package am.picsartacademy.oop2;

public class Puppy extends Dog {
    @Override
    public void eat() {
        super.eat();
        System.out.println("Puppy is eating...");
    }
}
