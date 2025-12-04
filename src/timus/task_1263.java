package timus;

import java.util.Scanner;

public class task_1263 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] votes = new int[n];

        for (int i = 0; i < m; i++) {
            int candidate = in.nextInt();  // номер кандидата (1..n)
            votes[candidate - 1]++;         // преобразуем в индекс 0..n-1
        }

        for (int i = 0; i < n; i++) {
            double percent = (double) votes[i] / m * 100.0;
            System.out.printf("%.2f%%%n", percent);
        }

        in.close();
    }
}
