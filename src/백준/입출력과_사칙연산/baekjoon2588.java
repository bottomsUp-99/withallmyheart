package 백준.입출력과_사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(br.readLine());
        int second = Integer.parseInt(br.readLine());
        int third = 0, fourth = 0, fifth = 0;
        for (int i = 0 ; i < 3 ; i++){
            int share = second%10;
            if (i == 0){
                third = share * first;
            } else if(i == 1){
                fourth = share * first;
            } else {
                fifth = share * first;
            }
            second /= 10;
        }
        System.out.println(third);
        System.out.println(fourth);
        System.out.println(fifth);
        System.out.println(third + fourth * 10 + fifth * 100);
    }
}
