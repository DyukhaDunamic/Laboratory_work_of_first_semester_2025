package timus;

import java.util.Scanner;

public class task_2012 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int f = in.nextInt();

        final int TOTAL_TALKS = 12;

        final int REMAINING_TIME = 240;

        final int TIME_PER_TASK = 45;

        int remainingTasks = TOTAL_TALKS - f;

        int requiredTime = remainingTasks * TIME_PER_TASK;

        if (requiredTime <= REMAINING_TIME) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        in.close();

    }

}
