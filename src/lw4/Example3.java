package lw4;

public class Example3 {

    public static void main(String[] args) {

        int rows = 5;
        int cols = 10;


        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                matrix[i][j] = 2;
            }
        }

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]);
            }

            System.out.println();
        }
    }
}
