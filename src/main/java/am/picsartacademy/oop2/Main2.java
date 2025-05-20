package am.picsartacademy.oop2;

public class Main2 {
    public static void main(String[] args) {
        Dog doc1 = new Dog();
        Dog doc2 = new Dog("Labrador");
        Dog doc3 = new Dog("Gampr", 4);


        System.out.println(doc3.type);
        System.out.println(doc3.age);
        System.out.println(doc2.type);

        System.out.println(doc1.age);
        System.out.println(doc2.age);

        System.out.println(doc1.type);




    }
}
