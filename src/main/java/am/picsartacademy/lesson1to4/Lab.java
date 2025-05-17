package am.picsartacademy.lesson1to4;

public class Lab {

    public static void main(String[] args) {
        int[] array = {8, 1, 6, 4, 9, 2};
        for (int i = 0; i < array.length - 1; i++) {
            System.out.println("Running for i=" + i);
            for (int j = 0; j < array.length - 1 - i; j++) {
                System.out.println("Running for j=" + j);

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    for ( int num : array) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                } else {
                    System.out.println("Nothing was swapped");
                }

            }
        }


        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        temp = array[5];
        array[5] = array[4];
        array[4] = temp;

        for (int num : array) {
            System.out.print(num + " ");
        }


        // Task 1: Print numbers from 1 to 15 using a simple for loop

        // Task 2: Print even numbers from -10 to 20 using two different approaches

        // Task 3: Print + symbols in increasing order from 1 to n rows

        // Task 4: Print + symbols in decreasing order from n to 1 rows

        // Task 5: Create an array with numbers from 1 to 11

        // Task 6: Create an array with even numbers from -10 to 10

        // Task 7: Print odd numbers from the given array

        // Task 8: Print elements from the array that are between -10 and 5 (inclusive)

        // Task 9: Print array elements divisible by 3 or 4

        // Task 10: Count and print number of even elements in array

        // Task 11.1: Calculate the sum of all elements in the array

        // Task 11.2: Calculate the sum of only positive elements in the array

        // Task 11.3: Calculate the multiplication of all elements in the array

        // Task 12: Find and print the maximal element from the array

        // Task 13: Find and print the minimal element from the array

        // Task 15: Swap two variables using a temporary variable

        // Task 16: Sort the array in ascending order using bubble sort algorithm
    }
}