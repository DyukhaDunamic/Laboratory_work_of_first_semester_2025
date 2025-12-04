package lw6;

public class Example8 {

    public static double computeAverage(int[] array) {

        if (array == null) {
            throw new IllegalArgumentException("Массив не может быть null");
        }

        if (array.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым");
        }

        long sum = 0;
        for (int element : array) {
            sum += element;
        }

        return (double) sum / array.length;
    }


    public static void main(String[] args) {
        int[] data1 = {1, 2, 3, 4, 5};
        System.out.println("Среднее {1,2,3,4,5}: " + computeAverage(data1)); // 3.0

        int[] data2 = {-2, 0, 2, 4};
        System.out.println("Среднее {-2,0,2,4}: " + computeAverage(data2)); // 1.0

        int[] data3 = {42};
        System.out.println("Среднее {42}: " + computeAverage(data3)); // 42.0

        int[] data4 = {Integer.MAX_VALUE, Integer.MAX_VALUE};
        System.out.println("Среднее {MAX,MAX}: " + computeAverage(data4));

        try {
            computeAverage(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка (null): " + e.getMessage());
        }

        try {
            computeAverage(new int[]{});
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка (пустой): " + e.getMessage());
        }
    }
}
