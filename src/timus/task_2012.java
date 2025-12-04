package timus;

import java.util.Scanner;

public class task_2012 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int f = in.nextInt();

        int remaining = 12 - f;
        int timeNeeded = remaining * 45;

        if (timeNeeded <= 300) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
