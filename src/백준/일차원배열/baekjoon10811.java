package 백준.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] basket = new int[n];
        for (int i = 0; i < basket.length; i++) {
            basket[i] = i + 1;
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int lt = Integer.parseInt(st.nextToken());
            int rt = Integer.parseInt(st.nextToken());
            while (lt < rt){
                int tmp = basket[lt - 1];
                basket[lt - 1] = basket[rt - 1];
                basket[rt - 1] = tmp;
                lt++;
                rt--;
            }
        }
        for (int a : basket){
            System.out.print(a + " ");
        }
    }
}
