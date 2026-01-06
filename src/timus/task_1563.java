import java.util.*;

public class task_1563 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine(); // поглощаем перевод строки после числа

        Set<String> seen = new HashSet<>();
        int bayanCount = 0;

        for (int i = 0; i < n; i++) {
            String shop = in.nextLine().trim();

            if (seen.contains(shop)) {
                bayanCount++;
            } else {
                seen.add(shop);
            }
        }

        System.out.println(bayanCount);

        in.close();
    }
}
