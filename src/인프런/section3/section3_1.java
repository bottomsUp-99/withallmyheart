package 인프런.section3;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class section3_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int first = Integer.parseInt(st.nextToken());
        stack.add(first);
        bw.write(first + " ");
        for (int i = 0; i < n - 1; i++) {
            int compare = Integer.parseInt(st.nextToken());
            if (compare > stack.peek()){
                bw.write(compare + " ");
                stack.add(compare);
            } else {
                stack.add(compare);
            }
        }
        bw.flush();
        bw.close();
    }
}
