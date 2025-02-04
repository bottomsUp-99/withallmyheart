package 백준.반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon25304 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        int sum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int things = Integer.parseInt(br.readLine());
        for (int i = 0; i < things; i++) {
            st = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            sum += price * num;
        }
        if (total == sum){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
