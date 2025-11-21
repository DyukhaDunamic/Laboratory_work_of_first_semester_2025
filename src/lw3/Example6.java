package lw3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size = 0;

        while (true) {
            System.out.println("Enter the size of the array: ");
            try {
                size = in.nextInt();

                if (size <= 0) {
                    System.out.println("Error: The array size must be a positive number. Try again.");
                    continue;
                }

            break;

            } catch (InputMismatchException e) {
                System.out.println("Error: Not a number was entered. Try again.");
                in.nextLine();
            }
        }

        int[] array = new int[size];

        int currentValue = 2;
        for (int i = 0; i < size; i++) {
            array[i] = currentValue;
            currentValue += 5;
        }

        System.out.print("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        in.close();

    }
}
