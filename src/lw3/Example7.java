package lw3;

public class Example7 {

    public static void main(String[] args) {

        final int SIZE = 10;

        char[] charArray = new char[SIZE];

        char currentChar = 'a';
        for (int i = 0; i < SIZE; i++) {
            charArray[i] = currentChar;
            currentChar += 2;
        }

        System.out.print("Direct order: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.print("Reverse order: ");
        for (int i = SIZE - 1; i >= 0; i--) {
            System.out.print(charArray[i] + " ");
        }

        System.out.println();

    }
}
