package 인프런.section5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class section5_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        int lt = 0;
        for (int rt = k - 1; rt < n; rt++) {
            HashSet<Integer> profit = new HashSet<>();
            for (int j = lt; j <= rt ; j++) {
                profit.add(num[j]);
            }
            sb.append(profit.size()).append(" ");
            lt++;
        }
        System.out.println(sb);
    }
}
