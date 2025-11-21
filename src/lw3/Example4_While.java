package lw3;

import java.util.Scanner;

public class Example4_While {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input a first number: ");
        int num1 = in.nextInt();
        System.out.print("Input a second number: ");
        int num2 = in.nextInt();

        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);
        int current = start;

        while (current <= end) {
            System.out.print(current + " ");
            current++;
        }

        in.close();
    }
}
