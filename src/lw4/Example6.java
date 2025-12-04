package lw4;

import java.util.Random;

public class Example6 {

    public static void main(String[] args) {
        int rows = 4;
        int cols = 5;

        Random random = new Random();

        int[][] original = new int[rows][cols];

        System.out.println("Исходный массив (" + rows + "x" + cols + "):");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                original[i][j] = random.nextInt(100);
                System.out.printf("%4d", original[i][j]);
            }

            System.out.println();
        }

        int rowToRemove = random.nextInt(rows);
        int colToRemove = random.nextInt(cols);

        System.out.println("\nУдаляем строку №" + rowToRemove + " и столбец №" + colToRemove);

        int newRows = rows - 1;
        int newCols = cols - 1;
        int[][] modified = new int[newRows][newCols];

        for (int i = 0; i < rows; i++) {

            if (i == rowToRemove) {
                continue;
            }

            for (int j = 0; j < cols; j++) {

                if (j == colToRemove) {
                    continue;
                }

                int newI = (i < rowToRemove) ? i : i - 1;
                int newJ = (j < colToRemove) ? j : j - 1;
                modified[newI][newJ] = original[i][j];
            }
        }

        System.out.println("\nИзменённый массив (" + newRows + "x" + newCols + "):");

        for (int i = 0; i < newRows; i++) {

            for (int j = 0; j < newCols; j++) {
                System.out.printf("%4d", modified[i][j]);
            }

            System.out.println();
        }
    }
}
