package am.picsartacademy.lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?: ");
        String name  = scanner.next();
        if (name.equals("Poghos")) {
            System.out.println("You are not from my group!");
        } else
            System.out.println("Hello, " + name);
    }
}
