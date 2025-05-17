package am.picsartacademy.lesson1to4;

public class Homework3 {
    public static void main(String[] args) {
        int v = 9;
        for (int j = v; j > 0; j--) {
            if (j % 2 != 0) {
                for (int k = 0; k < (v - j) / 2; k++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < j; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }






        int n = 9;
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
