import java.util.Scanner;

public class task_1243 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String nStr = in.nextLine().trim();  // считываем число как строку

        int remainder = 0;
        for (int i = 0; i < nStr.length(); i++) {
            char c = nStr.charAt(i);
            int digit = c - '0';  // преобразуем символ в число
            remainder = (remainder * 10 + digit) % 7;
        }

        System.out.println(remainder);
        in.close();
    }
}
