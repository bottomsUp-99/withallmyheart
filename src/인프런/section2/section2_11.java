package 인프런.section2;

import java.io.*;

public class section2_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] str = (br.readLine()).toCharArray();
        char compare = str[0];
        bw.write(compare);
        int count = 1;
        for (int i = 1; i < str.length; i++) {
            if (str[i] == compare){
                count++;
            } else {
                if (count > 1){
                    bw.write(String.valueOf(count));
                    bw.write(str[i]);
                    count = 1;
                    compare = str[i];
                } else {
                    bw.write(str[i]);
                    count = 1;
                    compare = str[i];
                }
            }
        }
        if (count > 1) bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
