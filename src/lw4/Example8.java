package lw4;

import java.util.Scanner;

public class Example8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для шифрования:");
        String text = scanner.nextLine();

        System.out.println("Введите ключ:");
        int key = scanner.nextInt();
        scanner.nextLine();

        String encryptedText = encrypt(text, key);
        System.out.println("Текст после преобразования: " + encryptedText);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        String response = scanner.nextLine().toLowerCase();

        switch (response) {
            case "y":
                String decryptedText = decrypt(encryptedText, key);
                System.out.println("Текст после обратного преобразования: " + decryptedText);
                break;
            case "n":
                System.out.println("До свидания!");
                break;
            default:
                System.out.println("Введите корректный ответ");
                break;
        }

        scanner.close();
    }

    public static String encrypt(String text, int key) {

        StringBuilder result = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';

                char shifted = (char) ((c - base + key) % 26 + base);
                result.append(shifted);
            } else {

                result.append(c);

            }
        }

        return result.toString();

    }

    public static String decrypt(String text, int key) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                char shifted = (char) ((c - base - key + 26) % 26 + base);
                result.append(shifted);
            } else {

                result.append(c);

            }
        }

        return result.toString();

    }
}
