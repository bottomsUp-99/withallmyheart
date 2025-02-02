package 인프런;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class section2_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toLowerCase().toCharArray();
        char find = (br.readLine().toLowerCase()).charAt(0);
        int sum = 0;
        for ( char c : str){
            if (find == c) sum++;
        }
        System.out.println(sum);

//        ---------------------------------------------------------------------------------------------------------------
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine().toLowerCase();
//        char find = (br.readLine().toLowerCase()).charAt(0);
//        int sum = 0;
//        for (int i = 0; i < str.length(); i++) {
//            char compare = str.charAt(i);
//            if (find == compare) sum++;
//        }
//        System.out.println(sum);
//        ---------------------------------------------------------------------------------------------------------------

    }
}
