package 인프런.section2;

import java.io.*;

public class section2_4 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        for (int i = 0; i < n; i++) {
//            char[] str = (br.readLine()).toCharArray();
//            char[] tmp = new char[str.length];
//            for (int j = 0; j < str.length; j++) {
//                tmp[j] = str[str.length - j - 1];
//            }
//            System.out.println(tmp);
//        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb;
        int n =Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            sb = new StringBuilder(br.readLine());
            bw.write(sb.reverse() + "\n");
        }
        bw.flush();
        bw.close();
    }
}
