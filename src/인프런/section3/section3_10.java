package 인프런.section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class section3_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int answer = 0;
        int n = Integer.parseInt(br.readLine());
        int[][] square = new int[n+2][n+2];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                square[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int compare = square[i][j];
                int max = Math.max(compare, square[i - 1][j]);
                max = Math.max(max, square[i + 1][j]);
                max = Math.max(max, square[i][j - 1]);
                max = Math.max(max, square[i][j + 1]);
                if (max == compare){
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
