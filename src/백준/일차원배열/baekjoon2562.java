package 백준.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.MIN_VALUE, index = -1;
        for (int i = 0; i < 9; i++) {
            int compare = Integer.parseInt(br.readLine());
            if (compare > max){
                max = compare;
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index + 1);
    }
}
