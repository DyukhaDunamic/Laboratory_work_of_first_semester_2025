package lw6;

public class Example3 {

    public static int max(int... numbers) {
        validateArgs(numbers);
        return java.util.Arrays.stream(numbers).max().orElse(0);
    }

    public static int min(int... numbers) {
        validateArgs(numbers);
        return java.util.Arrays.stream(numbers).min().orElse(0);
    }

    public static double average(int... numbers) {
        validateArgs(numbers);
        return java.util.Arrays.stream(numbers).average().orElse(0.0);
    }

    private static void validateArgs(int... numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым или null");
        }
    }

    public static void main(String[] args) {
        System.out.println("max(1, 5, 3, 9, 2) = " + max(1, 5, 3, 9, 2));
        System.out.println("min(1, 5, 3, 9, 2) = " + min(1, 5, 3, 9, 2));
        System.out.println("average(1, 5, 3, 9, 2) = " + average(1, 5, 3, 9, 2));

        int[] data = {10, 4, 7, 15, 3};
        System.out.println("max(data) = " + max(data));
        System.out.println("min(data) = " + min(data));
        System.out.println("average(data) = " + average(data));
    }
}
