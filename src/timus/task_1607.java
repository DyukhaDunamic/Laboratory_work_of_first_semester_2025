package timus;

import java.io.BufferedInputStream;
import java.io.IOException;

public class task_1607 {

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        long a = fs.nextInt();
        long b = fs.nextInt();
        long c = fs.nextInt();
        long d = fs.nextInt();

        long petya = a;
        if (c < petya) {
            System.out.println(petya);
            return;
        }
        long taxi = c;
        if (taxi == petya) {
            System.out.println(taxi);
            return;
        }

        while (true) {
            long nextPetya = petya + b;
            if (nextPetya > taxi) {
                System.out.println(taxi);
                return;
            }
            petya = nextPetya;
            if (petya == taxi) {
                System.out.println(petya);
                return;
            }

            long nextTaxi = taxi - d;
            if (nextTaxi < petya) {
                System.out.println(petya);
                return;
            }
            taxi = nextTaxi;
            if (taxi == petya) {
                System.out.println(taxi);
                return;
            }
        }
    }

    static class FastScanner {
        private final BufferedInputStream in = new BufferedInputStream(System.in);
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;
            while ((c = read()) <= 32) {
                if (c == -1) return Integer.MIN_VALUE;
            }
            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }
            int val = 0;
            while (c > 32) {
                val = val * 10 + (c - '0');
                c = read();
            }
            return val * sign;
        }
    }
}

