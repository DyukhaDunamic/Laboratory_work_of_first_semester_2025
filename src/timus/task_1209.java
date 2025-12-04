package timus;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class task_1209 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            long K = Long.parseLong(br.readLine().trim());
            long v = 8L * K - 7;
            long s = (long)Math.sqrt(v);
            if (s * s == v) {
                sb.append('1');
            } else {
                sb.append('0');
            }
            if (i < N - 1) sb.append(' ');
        }
        System.out.println(sb);
    }
}

