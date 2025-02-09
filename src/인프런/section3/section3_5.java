package 인프런.section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class section3_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 자연수 N 입력 받기
        System.out.println(countPrimes(n)); // 소수 개수 출력
    }

    public static int countPrimes(int n) {
        if (n < 2) return 0; // 1 이하는 소수가 아님

        boolean[] isPrime = new boolean[n + 1]; // 소수 여부 저장 배열
        int count = 0; // 소수 개수

        // 모든 수를 소수(true)로 초기화
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // 에라토스테네스의 체 알고리즘 적용
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) { // i가 소수이면
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false; // i의 배수는 소수가 아님
                }
            }
        }

        // 소수 개수 세기
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) count++;
        }
        return count;
    }
}
