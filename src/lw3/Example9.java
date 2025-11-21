package lw3;

import java.util.Random;

public class Example9 {

    public static void main(String[] args) {
        final int SIZE = 15;
        final int MAX_VALUE = 100;

        int[] array = new int[SIZE];
        Random random = new Random();

        System.out.println("Array: ");
        for (int i = 0; i < SIZE; i++) {
            array[i] = random.nextInt(MAX_VALUE);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int minValue = array[0];
        for (int i = 1; i < SIZE; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        System.out.print("The index(s) of the minimum element (" + minValue + "): ");
        for (int i = 0; i < SIZE; i++) {
            if (array[i] == minValue) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

    }
}
