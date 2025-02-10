package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon15989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int share = n / 3;
            int answer = 0;
            for (int j = 0; j <= share; j++) {
                int rest = n - 3 * j ;
                answer += rest/2 + 1;
            }
            System.out.println(answer);
        }
    }
}
