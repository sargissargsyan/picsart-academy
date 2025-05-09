package am.picsartacademy.lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        // version 1 of creating an array
        int[] array;
        array = new int[10];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        array[5] = 60;
        array[6] = 70;
        array[7] = 80;
        array[8] = 90;
        array[9] = 100;

        // version 2 of creating an array
        int[] array2 = {10,20,30,40,50,60,70,80,90,100};

        // version 3 of creating an array
        int[] array3 = new int[100];
        for (int i = 0; i < array3.length; i++) {
            System.out.println("Setting value for index " + i + " where value is " + (i + 1));
            array3[i] = i + 1;
        }

        // version 3 of creating an array
        int[] array4 = {8, 4, -22, 3, 88, 73, -1, 0, 5, 6};
        for(int i = 0; i < array4.length; i++) {
            if (array4[i] % 2==0) {
                System.out.println("Even number: " + array4[i]);
            } else {
                System.out.println("Odd number: " + array4[i]);
            }
        }

    }
}
