package 인프런.section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class section3_9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] square = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                square[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(solution(n, square));
    }
//    public static int solution_2(int n, int[][] arr) {
        //        int max_width = Integer.MIN_VALUE;
//        for (int i = 0; i < n; i++) {
//            int sum = 0;
//            for (int j = 0; j < n; j++) {
//                sum += square[i][j];
//            }
//            max_width = Math.max(max_width, sum);
//        }
//        int max_length = Integer.MIN_VALUE;
//        for (int i = 0; i < n; i++) {
//            int sum = 0;
//            for (int j = 0; j < n; j++) {
//                sum += square[j][i];
//            }
//            max_length = Math.max(max_length, sum);
//        }
//        int diagonal_left = 0;
//        for (int i = 0; i < n; i++) {
//            diagonal_left += square[i][i];
//        }
//        int diagonal_right = 0;
//        for (int i = 0; i < n; i++) {
//            diagonal_right += square[i][4 - i];
//        }
//        int answer = Math.max(max_length, max_width);
//        answer = Math.max(answer, diagonal_left);
//        answer = Math.max(answer, diagonal_right);
//        System.out.println(answer);
//    }
    public static int solution(int n, int[][] arr){
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;
        for(int i=0; i<n; i++){
            sum1=sum2=0;
            for(int j=0; j<n; j++){
                sum1+=arr[i][j];
                sum2+=arr[j][i];
            }
            answer=Math.max(answer, sum1);
            answer=Math.max(answer, sum2);
        }
        sum1=sum2=0;
        for(int i=0; i<n; i++){
            sum1+=arr[i][i];
            sum2+=arr[i][n-i-1];
        }
        answer=Math.max(answer, sum1);
        answer=Math.max(answer, sum2);
        return answer;
    }
}
