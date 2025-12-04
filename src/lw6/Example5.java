package lw6;

public class Example5 {

    public static long sumSquaresIterative(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n должно быть натуральным числом (n >= 1)");
        }

        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (long) i * i;
        }
        return sum;
    }

    public static long sumSquaresFormula(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n должно быть натуральным числом (n >= 1)");
        }

        return (long) n * (n + 1) / 2 * (2 * n + 1) / 3;
    }

    public static boolean verify(int n) {
        return sumSquaresIterative(n) == sumSquaresFormula(n);
    }

    public static void main(String[] args) {
        int n = 10;

        System.out.println("n = " + n);
        System.out.println("Сумма квадратов (цикл): " + sumSquaresIterative(n));
        System.out.println("Сумма квадратов (формула): " + sumSquaresFormula(n));
        System.out.println("Проверка совпадения: " + verify(n));

        System.out.println("\nДополнительные тесты:");
        for (int i = 1; i <= 5; i++) {
            long iterative = sumSquaresIterative(i);
            long formula = sumSquaresFormula(i);
            System.out.printf("n=%d: %d (цикл) = %d (формула)%n", i, iterative, formula);
        }
    }
}
