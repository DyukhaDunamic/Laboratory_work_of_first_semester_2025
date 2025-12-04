package lw4;

import java.util.Random;

public class Example5 {

    public static void main(String[] args) {
        int rows = 3;
        int cols = 5;

        int[][] original = new int[rows][cols];
        Random random = new Random();

        System.out.println("Исходный массив (" + rows + "x" + cols + "):");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                original[i][j] = random.nextInt(100);

                System.out.printf("%4d", original[i][j]);
            }
            System.out.println();
        }

        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                transposed[j][i] = original[i][j];
            }
        }

        System.out.println("\nТранспонированный массив (" + cols + "x" + rows + "):");

        for (int i = 0; i < cols; i++) {

            for (int j = 0; j < rows; j++) {
                System.out.printf("%4d", transposed[i][j]);
            }

            System.out.println();
        }
    }
}
