package lw6;

public class Example10 {

    public static int[] findMinMax(int... numbers) {

        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Необходимо передать хотя бы один аргумент");
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return new int[]{min, max};
    }

    private static void printArray(int[] arr) {
        if (arr == null) {
            System.out.println("null");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {

        int[] result1 = findMinMax(5, 2, 8, 1, 9);
        System.out.print("findMinMax(5, 2, 8, 1, 9) → ");
        printArray(result1); // [1, 9]

        int[] result2 = findMinMax(10, 3);
        System.out.print("findMinMax(10, 3) → ");
        printArray(result2); // [3, 10]

        int[] result3 = findMinMax(42);
        System.out.print("findMinMax(42) → ");
        printArray(result3); // [42, 42]

        int[] result4 = findMinMax(-5, -1, -10, -3);
        System.out.print("findMinMax(-5, -1, -10, -3) → ");
        printArray(result4); // [-10, -1]

        try {
            findMinMax();
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
