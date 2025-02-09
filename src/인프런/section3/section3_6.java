package 인프런.section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class section3_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int x : solution_1(n, arr)){
            System.out.print(x + " ");
        }
        System.out.println();
        for(int x : solution_2(n, arr)){
            System.out.print(x + " ");
        }
    }
    public static ArrayList<Integer> solution_1(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        StringBuilder sb;
        for (int i = 0; i < n; i++) {
            sb = new StringBuilder(String.valueOf(arr[i]));
            sb.reverse();
            int num = Integer.parseInt(sb.toString());
            if(isPrime(num)) answer.add(num);
        }
        return answer;
    }
    public static ArrayList<Integer> solution_2(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int res = 0;
            while(tmp > 0){
                int t = tmp % 10;
                res = res * 10 + t;
                tmp /= 10;
            }
            if (isPrime(res)) answer.add(res);
        }
        return answer;
    }

    public static boolean isPrime(int n){
        if (n == 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
