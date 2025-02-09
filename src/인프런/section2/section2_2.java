package 인프런.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class section2_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = (br.readLine()).toCharArray();
        char[] later = new char[str.length];
//        아스키코드 기준 65~90 사이에는 알파벳 대문자, 97~122에는 알파벳 소문자
//        for (int i = 0; i < str.length; i++) {
//            if (str[i] >= 65 && str[i] <= 90){
//                later[i] = Character.toLowerCase(str[i]);
//            } else {
//                later[i] = Character.toUpperCase(str[i]);
//            }
//        }

        for (int i = 0; i < str.length; i++) {
            if (Character.isUpperCase(str[i])){
                later[i] = Character.toLowerCase(str[i]);
            } else {
                later[i] = Character.toUpperCase(str[i]);
            }
        }
        System.out.println(later);
    }
}
