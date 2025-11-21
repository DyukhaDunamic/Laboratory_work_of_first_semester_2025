package lw3;

import java.util.Scanner;

public class Example5_While {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers should I add up?");
        int count = in.nextInt();

        int sum = 0;
        int found = 0;
        int num = 1;

        System.out.print("Number: ");

        while (found < count) {
            if (num % 5 == 2 || num % 3 == 1) {
                System.out.print(num + " ");
                sum += num;
                found++;
            }
            num++;
        }

        System.out.println("\nThe total: " + sum);
        in.close();
    }
}
