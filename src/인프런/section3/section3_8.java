package 인프런.section3;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class section3_8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int x : solution(arr, n)){
            System.out.print(x + " ");
        }
    }
    public static int[] solution(int[] arr, int n){
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) rank++;
            }
            answer[i] = rank;
        }
        return answer;
    }
}
