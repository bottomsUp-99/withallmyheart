package 백준.일차원배열;

import java.io.*;

public class baekjoon5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] students = new int[30];
        for (int i = 0; i < 30; i++) {
            students[i] = i + 1;
        }
        for (int i = 0; i < 28; i++) {
            int num = Integer.parseInt(br.readLine());
            students[num - 1] = 0;
        }
        for (int i = 0; i < students.length; i++) {
            if (students[i] != 0) System.out.println(i + 1);
        }
    }
}
