package timus;

import java.util.Scanner;

public class task_1209 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] results = new int[N];

        for (int i = 0; i < N; i++) {
            long Ki = in.nextLong();
            results[i] = getDigitAtPosition(Ki);
        }

        for (int i = 0; i < N; i++) {
            System.out.print(results[i]);
            if (i < N - 1) System.out.print(" ");
        }

        System.out.println();

        in.close();
    }

    private static int getDigitAtPosition(long Ki) {
        long position = 0;
        int power = 0;

        while (true) {
            int blockLength = power + 1;

            if (position + blockLength >= Ki) {
                long offset = Ki - position - 1;

                if (offset == 0) {
                    return 1;
                } else {
                    return 0;
                }
            }

            position += blockLength;
            power++;
        }
    }
}
