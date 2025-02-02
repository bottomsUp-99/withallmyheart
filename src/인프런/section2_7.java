package 인프런;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class section2_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = (br.readLine()).toCharArray();
        for (int i = 0; i < str.length; i++) {
            str[i] = Character.toLowerCase(str[i]);
        }
        int lt = 0, rt = str.length - 1;
        boolean isOkay = true;
        while(lt < rt){
            if (str[lt] != str[rt]) isOkay = false;
            lt++;
            rt--;
        }
        if (isOkay){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
