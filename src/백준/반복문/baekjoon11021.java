package 백준.반복문;

import java.io.*;
import java.util.StringTokenizer;

public class baekjoon11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int a= 0, b = 0;
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            bw.write("Case #" + (i + 1) + ": " + (a + b) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
