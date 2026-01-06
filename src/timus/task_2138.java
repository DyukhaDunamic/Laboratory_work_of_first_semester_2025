package timus;

import java.util.Scanner;

public class task_2138 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String typeA = in.next();
        long v = in.nextLong();

        boolean aGood = typeA.equals("GOOD");
        boolean bGood = !aGood;

        int[] bytes = new int[4];

        if (bGood) {
            for (int i = 3; i >= 0; i--) {
                bytes[i] = (int) (v & 255);
                v >>= 8;
            }
        } else {
            for (int i = 0; i < 4; i++) {
                bytes[i] = (int) (v & 255);
                v >>= 8;
            }
        }

        long result = 0;
        if (aGood) {
            for (int i = 0; i < 4; i++) {
                result = (result << 8) | bytes[i];
            }
        } else {
            for (int i = 3; i >= 0; i--) {
                result = (result << 8) | bytes[i];
            }
        }

        System.out.println(result);
    }
}
