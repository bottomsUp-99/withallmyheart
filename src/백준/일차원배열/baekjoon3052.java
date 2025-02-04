package 백준.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class baekjoon3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> rest = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            rest.add(num % 42);
        }
        System.out.println(rest.size());
    }
}
