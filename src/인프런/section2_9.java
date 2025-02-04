package 인프런;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class section2_9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = (br.readLine()).toCharArray();
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
//            if (Character.isDigit(str[i])) num.add((int) str[i]);
            if (Character.isDigit(str[i])) num.add(str[i] - '0');
        }
        int index = num.size() - 1;
        int answer = 0;
        for (int i = 0; i < num.size(); i++) {
            answer += (int) (num.get(i) * Math.pow(10, index));
            index--;
        }
        System.out.println(answer);
    }
}
