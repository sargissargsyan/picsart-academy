package am.picsartacademy.oop;

import am.picsartacademy.oop.models.Employee;
import am.picsartacademy.oop.models.Human;
import am.picsartacademy.oop.models.Student;

public class Main {
    public static void main(String[] args) {
        Student anna = new Student();
        anna.firstName = "Anna";
        anna.lastName = "Alexanyan";
        anna.age = 22;
        anna.gender = 'F';
        anna.married = false;
        anna.nationality = "Armenian";
        anna.degree = true;

        Human davit = new Human();
        davit.firstName = "Davit";
        davit.lastName = "Davtyan";
        davit.age = 21;
        davit.gender = 'M';
        davit.married = false;
        davit.nationality = "United States";
        davit.degree = true;

        anna.speck();
        davit.speck();

        System.out.println(anna.firstName);
        System.out.println(davit.lastName);
        System.out.println(anna.age);

        Student laura = new Student();
        laura.firstName = "Laura";
        laura.lastName = "Alexanyan";
        laura.age = 22;
        laura.gender = 'M';
        laura.married = false;
        laura.nationality = "United States";
        laura.degree = true;
        laura.setUniversity("SEUA");

        laura.setNameOfProfessor("Pr. Hovnanyan"); ;
        laura.setAverageGrade(90);
        laura.setPaid(false);

        System.out.println(laura.firstName);
        System.out.println(laura.getUniversity());

        Employee emp = new Employee();
        emp.firstName = "Alex";
        emp.lastName = "Alexan";
        emp.age = 22;
        emp.gender = 'M';
        emp.married = false;
        emp.nationality = "United States";
        emp.degree = true;
        emp.setManager("Alexan");
        emp.setSalary(220000.00);
        emp.setPosition("QA Engineer");

        System.out.println(emp.firstName);
        System.out.println(emp.getPosition());

        emp.speck();
        anna.speck();
        laura.speck();



    }
}
