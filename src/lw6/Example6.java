package lw6;

public class Example6 {

    public static int[] takeFirstElements(int[] originalArray, int count) {
        if (originalArray == null) {
            return null;
        }

        if (count >= originalArray.length) {
            return originalArray.clone();
        }

        return java.util.Arrays.copyOf(originalArray, count);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int[] result1 = takeFirstElements(array, 3);
        System.out.println("Первые 3 элемента: " + java.util.Arrays.toString(result1));

        int[] result2 = takeFirstElements(array, 10);
        System.out.println("Копия массива (запрошено 10 элементов): " + java.util.Arrays.toString(result2));

        int[] result3 = takeFirstElements(array, 0);
        System.out.println("0 элементов: " + java.util.Arrays.toString(result3));

        int[] result4 = takeFirstElements(null, 5);
        System.out.println("Передача null: " + result4);
    }
}
