package 인프런.section5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class section5_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine();
        String second = br.readLine();
        HashMap<Character, Integer> first_map = new HashMap<>();
        HashMap<Character, Integer> second_map = new HashMap<>();
        for (int i = 0; i < first.length(); i++) {
            first_map.compute(first.charAt(i), (key, value) -> value == null ? 1 : value + 1);
        }
        for (int i = 0; i < second.length(); i++) {
            second_map.compute(second.charAt(i), (key, value) -> value == null ? 1 : value + 1);
        }
        if (first_map.equals(second_map)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
