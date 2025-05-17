package am.picsartacademy.oop.models;

public class Student extends Human {
    private String university;
    private String nameOfProfessor;
    private int averageGrade;
    private boolean paid;
    public void getName() {
        System.out.println(firstName + " " + lastName);
    }

    @Override
    public void speck() {
        System.out.println("I am Specking Student!");
    }

    public void setUniversity(String uni) {
        university = uni;
    }
    public String getUniversity() {
        return university;
    }

    public void setNameOfProfessor(String nameOfProf) {
        nameOfProfessor = nameOfProf;
    }
    public String getNameOfProfessor() {
        return nameOfProfessor;
    }
    public void setAverageGrade(int avg) {
        averageGrade = avg;
    }
    public int getAverageGrade() {
        return averageGrade;
    }
    public void setPaid(boolean p) {
        paid = p;
    }
    public boolean getPaid() {
        return paid;
    }
}
