package lw3;

public class Example8 {

    public static void main(String[] args) {

        final int SIZE = 10;
        char[] consonants = new char[SIZE];

        char current = 'A';
        int count = 0;

        while (count < SIZE) {
            if (isConsonant(current)) {
                consonants[count] = current;
                count++;
            }
            current++;
        }

        System.out.println("Array consonants: ");
        for (char c : consonants) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    private static boolean isConsonant(char letter) {
        if (letter < 'A' || letter > 'Z') {
            return false;
        }

        switch (letter) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return false;
            default:
                return true;
        }
    }
}
