package lw3;

import java.util.Scanner;

public class Example5_For {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers should I add up?");
        int count = in.nextInt();

        int sum = 0;
        int found = 0;
        int num = 1;

        System.out.println("Number: ");

        for (; found < count; num++) {
            if (num % 5 == 2 || num % 3 == 1) {
                System.out.print(num + " ");
                sum += num;
                found++;
            }
        }

        System.out.println("\nThe total: " + sum);

        in.close();
    }
}
