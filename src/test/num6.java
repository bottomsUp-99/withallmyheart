package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class num6 {
    static int[] KEY1 = {1, 1, 2, 3, 3, 5, 6, 6, 6, 6};
    static int[] KEY2 = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("입력값을 입력하세요: ");
        int input = Integer.parseInt(br.readLine());

        Set<Integer> result = new HashSet<>();

        findNodes(input, result);

        System.out.println("결과: " + result);
    }

    public static void findNodes(int inp, Set<Integer> result) {
        List<Integer> nextKeys = new ArrayList<>();

        for (int i = 0; i < KEY1.length; i++) {
            if (KEY1[i] == inp) {
                nextKeys.add(KEY2[i]);
            }
        }

        if (nextKeys.isEmpty()) {
            result.add(inp);
            return;
        }

        for (int key : nextKeys) {
            findNodes(key, result);
        }
    }
}
