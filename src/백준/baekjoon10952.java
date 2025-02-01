package 백준;

import java.io.*;
import java.util.StringTokenizer;

public class baekjoon10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int a , b;
        boolean quit = true;
        while (quit){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if ((a == 0) || (b == 0)){
                quit = false;
            } else {
                bw.write(a + b + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
