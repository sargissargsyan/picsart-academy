package am.picsartacademy.lesson1to4;

import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        System.out.println("Enter Array size:");

        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Enter array "+ i + " element:");
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter Day Number:");
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        int day2 = in.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
