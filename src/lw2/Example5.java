package lw2;

import java.util.Scanner;

public class Example5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input an integer: ");
        int number = in.nextInt();

        int absNumber = Math.abs(number);

        int thousandDigit = (absNumber / 1000) % 10;

        System.out.println("The thousands digit in the number " + number + ": " + thousandDigit);

        in.close();

    }

}
