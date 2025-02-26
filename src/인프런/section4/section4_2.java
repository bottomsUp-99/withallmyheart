package 인프런.section4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class section4_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> answer = new ArrayList<>();

        int first = Integer.parseInt(br.readLine());
        int[] arr1 = new int[first];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < first; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        int second = Integer.parseInt(br.readLine());
        int[] arr2 = new int[second];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < second; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        for (int a : solution(first, second, arr1, arr2)){
            System.out.print(a + " ");
        }
    }
    public static ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (a[p1] == b[p2]) {
                answer.add(a[p1++]);
                p2++;
            } else if (a[p1] < b[p2]) p1++;
            else p2++;
        }
        return answer;
    }
}
