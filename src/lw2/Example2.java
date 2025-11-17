package lw2;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input an integer: ");
        int number = in.nextInt();

        boolean condition1 = (number % 5 == 2);
        boolean condition2 = (number % 7 == 1);

        if (condition1 && condition2) {
            System.out.println("The number satisfies both conditions: ");
            System.out.println("– When divided by 5, the remainder is 2");
            System.out.println("– When divided by 7, the remainder is 1");
        } else {
            System.out.println("The number does NOT satisfy the conditions.");
            if (!condition1) {
                System.out.println("– When divided by 5, the remainder is NOT 2 (remainder: " + (number % 5) + ")");
            }
            if (!condition2) {
                System.out.println("– When divided by 7, the remainder is NOT 1 (remainder: " + (number % 7) + ")");
            }
        }

        in.close();

    }
}
