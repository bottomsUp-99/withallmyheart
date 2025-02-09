package 인프런.section3;

import java.io.*;
import java.util.StringTokenizer;

public class section3_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = Integer.parseInt(st.nextToken());
        int count = 1;
        for (int i = 0; i < num - 1; i++) {
            int compare = Integer.parseInt(st.nextToken());
            if (compare > max){
                count++;
                max = compare;
            }
        }
        System.out.println(count);
    }
}
