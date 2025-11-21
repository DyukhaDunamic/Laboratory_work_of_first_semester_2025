package timus;

import java.util.Scanner;

public class task_2001 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a1 = in.nextInt(), b1 = in.nextInt();
        int a2 = in.nextInt(), b2 = in.nextInt();
        int a3 = in.nextInt(), b3 = in.nextInt();

        int x = a1 - a3;
        int y = b1 - b2;

        System.out.println(x + " " + y);

        in.close();
    }
}
