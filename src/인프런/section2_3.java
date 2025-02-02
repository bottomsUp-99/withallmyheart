package 인프런;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class section2_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String answer = "";
        int max = 0;
        while(st.hasMoreTokens()){
            String compare = st.nextToken();
            if (max < compare.length()){
                answer = compare;
                max = answer.length();
            }
        }
        System.out.println(answer);
    }
}
