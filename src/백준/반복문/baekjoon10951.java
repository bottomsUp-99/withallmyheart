package 백준.반복문;

import java.io.*;
import java.util.StringTokenizer;

public class baekjoon10951 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        String str;
//        while((str = br.readLine()) != null){
//            StringTokenizer st = new StringTokenizer(str);
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            bw.write((a + b) + "\n");
//        }
//        bw.flush();
//        bw.close();

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        String str;
//        while ((str=br.readLine()) != null){
//            int a = str.charAt(0)-48;
//            int b = str.charAt(2)-48;
//            sb.append(a+b).append("\n");
//        }
//        System.out.print(sb);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;

        while ((str = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(str);

            if (st.hasMoreTokens()) {
                int a = Integer.parseInt(st.nextToken());
                if (st.hasMoreTokens()) {
                    int b = Integer.parseInt(st.nextToken());
                    bw.write((a + b) + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
