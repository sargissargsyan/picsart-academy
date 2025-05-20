package am.picsartacademy.oop;

import am.picsartacademy.oop.models.Employee;
import am.picsartacademy.oop.models.Human;
import am.picsartacademy.oop.models.Student;

public class Main {
    public static void main(String[] args) {
        Human human = new Employee();
        Human human2 = new Student();

        Employee employee = (Employee) human2;
        employee.speck("tete");
        human.speck();
        human2.speck();

    }
}
