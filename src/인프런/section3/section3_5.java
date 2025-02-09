package 인프런.section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class section3_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(countPrimes_1(n));
        System.out.println(countPrimes_2(n));
    }

    public static int countPrimes_1(int n) {
        if (n < 2) return 0;

        boolean[] isPrime = new boolean[n + 1];
        int count = 0;

        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) count++;
        }
        return count;
    }

    public static int countPrimes_2(int n){
        int[] isPrime = new int[n + 1];
        int count = 0;
        for (int i = 1; i < isPrime.length; i++) {
            isPrime[i] = 0;
        }
        for (int i = 2; i <= n; i++) {
            if (isPrime[i] == 0){
                count++;
                for (int j = i; j <= n; j+= i) {
                    isPrime[j] = 1;
                }
            }
        }
        return count;
    }
}
