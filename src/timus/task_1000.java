package timus;

import java.util.Scanner;

public class task_1000 {

      public static void main(String[] args) {

          Scanner in = new Scanner(System.in);

          System.out.println("Input an integer A: ");
          int A = in.nextInt();

          System.out.println("Input an integer B: ");
          int B = in.nextInt();

          int sum = A + B;
          System.out.println("Total: " + sum);

          in.close();

    }
}
