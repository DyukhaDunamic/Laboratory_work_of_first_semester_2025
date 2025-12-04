package lw6;

public class Example9 {

    public static void swapElements(char[] chars) {

        if (chars == null) {
            throw new IllegalArgumentException("Массив не может быть null");
        }

        int n = chars.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[n - 1 - i];
            chars[n - 1 - i] = temp;
        }
    }

    private static void printArray(char[] array) {
        if (array == null) {
            System.out.println("null");
            return;
        }

        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print("'" + array[i] + "'");
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        char[] arr1 = {'a', 'b', 'c', 'd', 'e'};
        System.out.print("Исходный: ");
        printArray(arr1);
        swapElements(arr1);
        System.out.print("После обмена: ");
        printArray(arr1);

        char[] arr2 = {'x', 'y'};
        System.out.print("Исходный: ");
        printArray(arr2);
        swapElements(arr2);
        System.out.print("После обмена: ");
        printArray(arr2);

        char[] arr3 = {'z'};
        System.out.print("Исходный: ");
        printArray(arr3);
        swapElements(arr3);
        System.out.print("После обмена: ");
        printArray(arr3);

        char[] arr4 = {};
        System.out.print("Исходный: ");
        printArray(arr4);
        swapElements(arr4);
        System.out.print("После обмена: ");
        printArray(arr4);

        try {
            swapElements(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
