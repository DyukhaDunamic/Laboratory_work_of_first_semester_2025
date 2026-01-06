import java.util.Scanner;

public class timus_1327 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // Количество нечётных чисел в [A; B]
        int count = ((B + 1) / 2) - (A / 2);

        System.out.println(count);
        scanner.close();
    }
}