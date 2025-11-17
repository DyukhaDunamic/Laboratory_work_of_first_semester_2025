package lw2;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input an integer: ");
        int number = in.nextInt();

        if (number % 3 == 0) {
            System.out.println("The number " + number + " is divisible by 3 without a remainder");
        } else {
            System.out.println("The number " + number + "  is not divisible by 3 without a remainder");
        }

        in.close();

    }
}
