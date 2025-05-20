package am.picsartacademy.oop2;

public class Dog extends Animal {
    String type;
    int age;

    public Dog() {

    }

    public Dog(String type) {
        this.type = type;
    }

    public Dog(String type, int age) {
        this.type = type;
        this.age = age;
    }

    public void eat() {
        super.eat();
        System.out.println("Dog is eating...");
    }

    public void sleep() {
        System.out.println("Dog is sleeping...");
    }
}
