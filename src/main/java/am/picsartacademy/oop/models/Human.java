package am.picsartacademy.oop.models;

import am.picsartacademy.oop.exepations.AgeException;
import am.picsartacademy.oop.exepations.InvalidNameException;

public class Human {
    public int currentYear = 2025;
    public String firstName;
    public String lastName;
    public int age;
    public char gender;
    public String nationality;
    public boolean married;
    public boolean degree;

    public void speck() {
        System.out.println("I am Specking Human!");
    }

    public void setFirstName(String firstName) {
        if (firstName.length() < 3) {
            throw new RuntimeException();
        } else {
            this.firstName = firstName;
        }
    }

    public void setAge(int age) throws AgeException {
        if (age < 0) {
            throw new AgeException(age + " is a negative value. Age should be a positive integer.");
        } else {
            this.age = age;
        }
    }

    public static int getRandom() {
        return 10;
    }
}
