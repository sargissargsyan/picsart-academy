package am.picsartacademy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int y = 0;
        try {
            x = scanner.nextInt();
            y = scanner.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println(exception.getClass().toString());
        } finally {
            scanner.close();
        }
        try {
            int z = x / y;
            System.out.print(z);
        } catch (ArithmeticException exception) {
            System.out.print(exception.getClass().toString());
            System.out.println(": / by zero");

        }
//
//
//        try {
//            int n = 6 / 0;
//        } catch (ArithmeticException e) {
//            System.out.println("you cannot divide by zero");
//
//        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("what is your name?");
//        String firstName = scanner.nextLine();
//
//        Human human1 = new Human();
//        try {
//            human1.setFirstName(firstName);
//        } catch (InvalidNameException e) {
//            System.out.println(e.toString());
//            System.out.println("Setting default name John");
//            human1.setFirstName("John");
//        }
//
//        System.out.println("what is your age?");
//        int age = 0;
//        try {
//            age = scanner.nextInt();
//        } catch (InputMismatchException e) {
//            System.out.println("The age should be an integer");
//        }
//        try {
//            human1.setAge(age);
//            System.out.println(human1.age);
//        } catch (AgeException e) {
//            System.out.println(e.toString());
//            System.out.println("Defaulting to age 20");
//            human1.setAge(20);
//        } finally {
//            System.out.println("Finally the age is " + human1.age);
//        }
//        System.out.println(human1.age);
    }
}
