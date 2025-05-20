package am.picsartacademy.oop2;

public class Animal {
    private String name;
    private int age;

    public Animal(String name) {
        this.name = name;
    }
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Animal() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void eat() {
        System.out.println("Animal ia eating....");
    }

    public void sleep() {
        System.out.println("Animal is sleeping...");
    }

}
