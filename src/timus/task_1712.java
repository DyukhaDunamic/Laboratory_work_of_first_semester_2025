import java.util.Scanner;

public class task_1712 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Читаем решётку (4 строки)
        char[][] grid = new char[4][4];
        for (int i = 0; i < 4; i++) {
            String line = scanner.nextLine().trim();
            for (int j = 0; j < 4; j++) {
                grid[i][j] = line.charAt(j);
            }
        }

        // Читаем зашифрованный квадрат (4 строки)
        char[][] cipher = new char[4][4];
        for (int i = 0; i < 4; i++) {
            String line = scanner.nextLine().trim();
            for (int j = 0; j < 4; j++) {
                cipher[i][j] = line.charAt(j);
            }
        }

        StringBuilder password = new StringBuilder();

        // Делаем 4 этапа (по одному на каждый поворот)
        for (int step = 0; step < 4; step++) {
            // На текущем положении решётки собираем символы из клеток с 'X'
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (grid[i][j] == 'X') {
                        password.append(cipher[i][j]);
                    }
                }
            }
            // Поворачиваем решётку на 90° по часовой стрелке
            grid = rotateClockwise(grid);
        }

        System.out.println(password.toString());
        scanner.close();
    }

    // Метод для поворота матрицы 4x4 на 90° по часовой стрелке
    private static char[][] rotateClockwise(char[][] matrix) {
        char[][] rotated = new char[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                rotated[j][3 - i] = matrix[i][j];
            }
        }
        return rotated;
    }
}
