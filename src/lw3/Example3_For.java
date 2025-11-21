package lw3;

import java.util.Scanner;

public class Example3_For {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("How many Fibonacci numbers to output?");
        int count = in.nextInt();

        if (count < 1) {
            System.out.println("Input an integer ≥ 1.");
        } else {
            int a = 1, b = 1;
            for (int i = 1; i <= count; i++) {
                if (i == 1 || i == 2) {
                    System.out.print(1 + " ");
                } else {
                    int next = a + b;
                    System.out.print(next + " ");
                    a = b;
                    b = next;
                }
            }
        }
        in.close();
    }
}
