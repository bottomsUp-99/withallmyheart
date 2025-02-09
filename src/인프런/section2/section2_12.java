package 인프런.section2;

import java.io.*;
import java.util.ArrayList;

public class section2_12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        ArrayList<String> letter = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            letter.add(str.substring(7 * i, (7 * i) + 7));
        }
        for (int i = 0; i < n; i++) {
            char[] alphabet = letter.get(i).toCharArray();
            String digit = "";
            for (int j = 0; j < alphabet.length; j++) {
                if (alphabet[j] == '#'){
                    digit += 1;
                } else {
                    digit += 0;
                }
            }
            int translation = Integer.parseInt(digit, 2);
            bw.write((char)translation);
        }
        bw.flush();
        bw.close();
    }
}
