package 인프런.section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class section3_10 {
    //    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        int answer = 0;
//        int n = Integer.parseInt(br.readLine());
//        int[][] square = new int[n+2][n+2];
//        for (int i = 1; i <= n; i++) {
//            st = new StringTokenizer(br.readLine());
//            for (int j = 1; j <= n; j++) {
//                square[i][j] = Integer.parseInt(st.nextToken());
//            }
//        }
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                int compare = square[i][j];
//                int max = Math.max(compare, square[i - 1][j]);
//                max = Math.max(max, square[i + 1][j]);
//                max = Math.max(max, square[i][j - 1]);
//                max = Math.max(max, square[i][j + 1]);
//                if (max == compare){
//                    answer++;
//                }
//            }
//        }
    // 봉우리 찾기--->이렇게 해야 함
//        for (int i = 1; i <= n; i++) {
//        for (int j = 1; j <= n; j++) {
//            int compare = square[i][j];
//
//            // 상하좌우 모두 비교하여 가장 큰 경우만 카운트
//            if (compare > square[i - 1][j] &&
//                    compare > square[i + 1][j] &&
//                    compare > square[i][j - 1] &&
//                    compare > square[i][j + 1]) {
//                answer++;
//            }
//        }
//    }
//        System.out.println(answer);
//    }
    static int[] dx={-1, 0, 1, 0};
    static int[] dy={0, 1, 0, -1};
    public static int solution(int n, int[][] arr){
        int answer=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                boolean flag=true;
                for(int k=0; k<4; k++){
                    int nx=i+dx[k];
                    int ny=j+dy[k];
                    if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]){
                        flag=false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] arr=new int[n][n];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        System.out.print(solution(n, arr));
    }
}
