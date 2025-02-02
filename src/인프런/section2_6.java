package 인프런;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class section2_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] s = (br.readLine()).toCharArray();

//        HashMap<Integer, Character> map = new HashMap<>();
//        for (int i = 0; i < s.length; i++) {
//            if (!map.containsValue(s[i])){
//                map.put(i, s[i]);
//            }
//        }
//        for (int key : map.keySet()) {
//            bw.write(map.get(key));
//        }
//        bw.flush();
//        bw.close();

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (char c : s) {
            set.add(c);
        }
        for (char c : set) {
            bw.write(c);
        }
        bw.flush();
        bw.close();
    }
}
