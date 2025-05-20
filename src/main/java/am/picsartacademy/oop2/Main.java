package am.picsartacademy.oop2;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Cow("Tsaxik", 10);
        Animal c = new Dog();
        Animal d = new Puppy();
        Dog dog = new Puppy();

        System.out.println(b.getName());
        System.out.println(b.getAge());


        a.eat();
        b.eat();
        c.eat();
        c.sleep();
    }

}
