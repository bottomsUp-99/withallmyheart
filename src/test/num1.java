package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println("반복문 : " + solution1(n));
        System.out.println("단순연산 : " + solution2(n));
        System.out.println("재귀 : " + solution3(n));
    }
    public static int solution1(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static int solution2(int n){
        return n * (n + 1) / 2;
    }
    public static int solution3(int n){
        if (n == 1) {
            return 1;
        } else {
            return n + solution3(n - 1);
        }
    }
}
