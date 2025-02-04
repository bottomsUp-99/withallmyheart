package 백준.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        float[] score = new float[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < score.length; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }
        float max = Integer.MIN_VALUE;
        for (double i : score){
            max = (float) Math.max(i, max);
        }
        for (int i = 0; i < score.length; i++) {
            score[i] = score[i] / max * 100;
        }
        float avg = 0;
        for (float v : score) {
            avg += v;
        }
        System.out.println(avg/score.length);
    }
}
