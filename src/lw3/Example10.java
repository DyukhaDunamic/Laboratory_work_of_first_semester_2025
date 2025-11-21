package lw3;

import java.util.Random;
import java.util.Arrays;


public class Example10 {

    public static void main(String[] args) {

        final int SIZE = 10;

        int[] array = new int[SIZE];
        Random random = new Random();

        System.out.println("The original array: ");
        for (int i = 0; i < SIZE; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        Arrays.sort(array);
        reverseArray(array);

        System.out.print("Sorted (descending): ");
        for (int value : array) {
            System.out.print(value + " ");
        }

        System.out.println();
    }

    private static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}
