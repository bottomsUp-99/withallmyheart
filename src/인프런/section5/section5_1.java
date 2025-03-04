package 인프런.section5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class section5_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character, Integer> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        for (int i = 0; i < n; i++) {
            map.compute(str.charAt(i), (key, value) -> value == null ? 1 : value + 1);
        }

        char maxKey = ' ';
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        System.out.println(maxKey);
    }
}
