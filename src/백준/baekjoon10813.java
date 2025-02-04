package 백준;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] basket = new int[n];
        for (int i = 0; i < n; i++) {
            basket[i] = i + 1;
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int tmp = basket[from - 1];
            basket[from - 1] = basket[to - 1];
            basket[to - 1] = tmp;
        }
        for (int j : basket) {
            bw.write(j + " ");
        }
        bw.flush();
        bw.close();
    }
}
