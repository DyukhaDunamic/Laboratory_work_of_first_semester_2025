package timus;

import java.util.Scanner;

public class task_1935 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sumA = 0;
        int maxA = 0;

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            sumA += a;
            if (a > maxA) {
                maxA = a;
            }
        }

        int totalSheets = sumA + maxA;

        System.out.println(totalSheets);

        in.close();
    }
}

