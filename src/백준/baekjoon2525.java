package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int plus = Integer.parseInt(br.readLine());
        m += plus;
        if (m >= 60){
            int share = m / 60;
            m %= 60;
            h += share;
            if (h >= 24){
                System.out.println((h - 24) + " " + m);
            }else {
                System.out.println(h + " " + m);
            }
        } else {
            System.out.println(h + " " + m);
        }
    }
}
