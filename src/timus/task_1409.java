package timus;

import java.util.Scanner;

public class task_1409 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int G = in.nextInt();
        int L = in.nextInt();

        int notShotByHarry = L - 1;
        int notShotByLarry = G - 1;

        System.out.println(notShotByHarry + " " + notShotByLarry);

        in.close();

    }
}
