package 백준.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = (br.readLine()).toCharArray();
        int n = Integer.parseInt(br.readLine());
        System.out.println(str[n - 1]);
    }
}
