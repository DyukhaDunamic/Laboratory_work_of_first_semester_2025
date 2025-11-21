package lw3;

import java.util.Scanner;

public class Example4_For {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input a first number: ");
        int num1 = in.nextInt();
        System.out.println("Input a second number: ");
        int num2 = in.nextInt();

        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);

        for (int i = start; i <= end; i++) {
            System.out.println(i + " ");
        }

        in.close();

    }
}
