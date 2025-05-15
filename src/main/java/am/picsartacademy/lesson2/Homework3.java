package am.picsartacademy.lesson2;

public class Homework3 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < (n - i) / 2; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }


    }
}
