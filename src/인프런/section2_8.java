package 인프런;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class section2_8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] str = (br.readLine()).toLowerCase().toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (Character.isAlphabetic(str[i])) sb.append(str[i]);
        }
        String original = String.valueOf(sb);
        String compare = String.valueOf(sb.reverse());
        if (original.equals(compare)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
