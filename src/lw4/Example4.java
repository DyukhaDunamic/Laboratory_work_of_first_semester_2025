package lw4;

public class Example4 {

    public static void main(String[] args) {

        int height = 6;

        int[][] triangle = new int[height][];

        for (int i = 0; i < height; i++) {

            triangle[i] = new int[i + 1];

            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = 1;
            }
        }

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j]);
            }

            System.out.println();
        }
    }
}
