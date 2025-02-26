package 인프런.section4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class section4_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<>();
        int first = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < first; i++) {
            numbers.add(Integer.parseInt(st.nextToken()));
        }
        int second = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < second; i++) {
            numbers.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(numbers);
        for (int a : numbers){
            System.out.print(a + " ");
        }
    }
}
