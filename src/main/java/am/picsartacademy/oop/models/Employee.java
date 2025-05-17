package am.picsartacademy.oop.models;

public class Employee extends Human {
    private double salary;
    private String position;
    private String manager;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public String getManager() {
        return manager;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    private String company;

    @Override
    public void speck() {
        System.out.println("I am Specking Employee!");
    }
}
