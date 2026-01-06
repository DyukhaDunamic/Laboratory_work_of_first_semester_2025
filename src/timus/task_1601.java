import java.util.Scanner;

public class task_1601 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        long unusedBooms = 0;
        long survivedDroids = 0;

        for (int i = 0; i < n; i++) {
            long ai = scanner.nextLong();

            if (ai > k) {
                unusedBooms += ai - k;
            } else {
                survivedDroids += k - ai;
            }
        }

        System.out.println(unusedBooms + " " + survivedDroids);
        scanner.close();
    }
}
