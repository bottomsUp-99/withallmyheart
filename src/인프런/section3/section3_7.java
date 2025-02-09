package 인프런.section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class section3_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(arr, n));
    }
    public static int solution(int[] arr, int n){
        int answer = 0;
        int before = 0;
        if (arr[0] == 1){
            answer++;
            before = arr[0];
        }
        int plus = 0;
        for (int i = 1; i < arr.length; i++) {
            if ((before == arr[i]) && before == 1){
                plus++;
                answer += plus + 1;
            } else if (arr[i] == 1){
                answer++;
                plus = 0;
            } else {
                plus = 0;
            }
            before = arr[i];
        }
        return answer;
    }
}
