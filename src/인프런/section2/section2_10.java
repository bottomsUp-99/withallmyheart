package 인프런.section2;

import java.io.*;
import java.util.StringTokenizer;

public class section2_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] str = st.nextToken().toCharArray();
        char c = st.nextToken().charAt(0);
        for (int i = 0; i < str.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < str.length; j++) {
                if (str[j] == c) min = Math.min(min, Math.abs(i - j));
            }
            bw.write(min + " ");
        }
        bw.flush();
        bw.close();
    }
}
