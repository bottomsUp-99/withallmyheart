package 인프런.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class section2_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] s = (br.readLine()).toCharArray();
        int lt = 0, rt = s.length - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(s[lt])){
                lt++;
            } else if (!Character.isAlphabetic(s[rt])){
                rt--;
            } else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
//            if (((s[lt] >= 65 && s[lt] <= 90) || (s[lt] >= 97 && s[lt] <= 122)) && (s[rt] >= 65 && s[rt] <= 90) || (s[rt] >= 97 && s[rt] <= 122)){
//                char tmp = s[lt];
//                s[lt] = s[rt];
//                s[rt] = tmp;
//            }
//            lt++;
//            rt--;
        }
        System.out.println(s);
    }
}
