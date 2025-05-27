package am.picsartacademy.oop3;

public class Cow implements Animal {
    @Override
    public void eat() {
        System.out.println("Cow Eats");
    }

    @Override
    public void sleep() {
        System.out.println("Cow Sleeps");
    }

    @Override
    public int getAge() {
        return 5;
    }
}
