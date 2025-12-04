package lw6;

public class Example7 {

    public static int[] getCharCodes(char[] chars) {
        if (chars == null) {
            return null;
        }

        int[] codes = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            codes[i] = (int) chars[i];
        }
        return codes;
    }

    public static void main(String[] args) {
        char[] sample = {'A', 'b', '1', '@', 'Я'};
        int[] codes = getCharCodes(sample);

        System.out.println("Символы: " + java.util.Arrays.toString(sample));
        System.out.println("Коды:    " + java.util.Arrays.toString(codes));

        char[] empty = {};
        int[] emptyCodes = getCharCodes(empty);
        System.out.println("Пустой массив символов: " + java.util.Arrays.toString(empty));
        System.out.println("Его коды: " + java.util.Arrays.toString(emptyCodes));

        int[] nullCodes = getCharCodes(null);
        System.out.println("Передача null: " + nullCodes);
    }
}
