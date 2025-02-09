package 인프런.section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class section3_4 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int num = Integer.parseInt(br.readLine());
//        for (int i = 1; i <= num; i++) {
//            System.out.print(solution(i) + " ");
//        }
//    }
//    public static int solution(int a){
//        if (a == 1){
//            return 1;
//        } else if (a == 2) {
//            return 1;
//        } else {
//            return solution(a - 1) + solution(a - 2);
//        }
//    }

    static int[] memo; // 메모이제이션 배열
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        memo = new int[num + 1];  // 피보나치 값을 저장할 배열

        for (int i = 1; i <= num; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int a) {
        if (a == 1 || a == 2) {
            return 1;
        }
        if (memo[a] != 0) {  // 이미 계산된 값이면 재사용
            return memo[a];
        }
        return memo[a] = fibonacci(a - 1) + fibonacci(a - 2);  // 값 저장 후 반환
    }
}
