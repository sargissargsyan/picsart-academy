package am.picsartacademy.pass_by_value;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(15);
        Student s2 = new Student(25);
        System.out.println(s1.hashCode());
        change(s1);
        System.out.println(s1.getAge());
        swap(s1, s2);
        System.out.println(s1.getAge());
        System.out.println(s2.getAge());
    }

    public static void swap(Student a, Student b) {
        Student temp = a;
        a = b;
        b = temp;

    }

    public static Student change(Student a) {
        a = new Student(a.getAge() + 1);
        a.setAge(100);
        a = new Student(20);
        a.setAge(500);
        System.out.println(a.getAge());
        return a;
    }
}
