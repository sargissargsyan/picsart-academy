package am.picsartacademy.oop3;

public class Main {
    static String currentYear = "2020";
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.eat();
        System.out.println(currentYear);
        int currentYear = Animal.currentYear;
        double v = Math.random() * 10;
    }
}
