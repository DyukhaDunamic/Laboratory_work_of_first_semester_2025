package lw1;

import java.util.Scanner;

public class Example14 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = in.nextInt();

        int prev = number - 1;
        int curr = number;
        int next = number + 1;

        int sum = prev + curr + next;

        long square = (long) sum * sum;

        System.out.println("Sequence: ");
        System.out.println(prev);
        System.out.println(curr);
        System.out.println(next);
        System.out.println(square);

        in.close();
    }


}
