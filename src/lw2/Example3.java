package lw2;

import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input an integer: ");
        int number = in.nextInt();

        boolean isDivisibleBy4 = (number % 4 == 0);
        boolean isAtLeast10 = (number >= 10);

        if (isDivisibleBy4 && isAtLeast10) {
            System.out.println("The number passes the conditions: ");
            System.out.println("- Is evenly divisible by 4");
            System.out.println("- Is not less than by 10");
        } else {
            System.out.println("The number is not in compliance with the conditions.");
            if (!isDivisibleBy4) {
                System.out.println("- Is NOT divisible by 4 (remainder: " + (number % 4) + ")");
            }
            if (!isAtLeast10) {
                System.out.println("- Is less than by 10 (the input number: " + number + ")");
            }
        }

        in.close();

    }
}

