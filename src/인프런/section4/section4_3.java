package 인프런.section4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class section4_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] profit = new int[n];
        for (int i = 0; i < n; i++) {
            profit[i] = Integer.parseInt(st.nextToken());
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n - k; i++) {
            int cmp = 0;
            for (int j = i; j < i + k; j++) {
                cmp += profit[j];
            }
            max = Math.max(max, cmp);
        }
        System.out.println(max);
    }
}
