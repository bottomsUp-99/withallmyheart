package 백준.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int find = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (find == Integer.parseInt(st.nextToken())) sum++;
        }
        System.out.println(sum);
    }
}
