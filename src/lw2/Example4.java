package lw2;

import java.util.Scanner;

public class Example4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input an integer: ");
        int number = in.nextInt();

        if (number >= 5 && number <= 10) {
            System.out.println("Integer " + number + " is in the range from 5 to 10 inclusive.");
        } else {
            System.out.println("Integer " + number + " NOT is in the range from 5 to 10 inclusive.");
            if (number < 5) {
                System.out.println("Explanation: the input is under 5.");
            } else {
                System.out.println("Explanation: the input is over 10.");
            }
        }

        in.close();

    }
}

