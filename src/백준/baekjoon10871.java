package 백준;

import java.io.*;
import java.util.StringTokenizer;

public class baekjoon10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int compare = Integer.parseInt(st.nextToken());
            if ( x > compare) bw.write(compare + " ");
        }
        bw.flush();
        bw.close();
    }
}
