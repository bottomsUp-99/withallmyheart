package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("후원한 총 인원(단위 : 명)을 입력하시오 : ");
        int x = Integer.parseInt(br.readLine());
        System.out.print("후원한 총 금액(단위 : 원)을 입력하시오 : ");
        int y = Integer.parseInt(br.readLine());

        int[] result = donationAnalysis(x, y);

        if (result != null) {
            System.out.println("1000원 : " + result[0] + "명");
            System.out.println("5000원 : " + result[1] + "명");
            System.out.println("10000원 : " + result[2] + "명");
        } else {
            System.out.println("인원과 후원 금액의 조합이 일치하지 않습니다.");
        }
    }
    public static int[] donationAnalysis(int x, int y) {
        int count1000 = 0, count5000 = 0, count10000 = 0;

        count10000 = Math.min(y / 10000, x);
        y -= count10000 * 10000;
        x -= count10000;

        count5000 = Math.min(y / 5000, x);
        y -= count5000 * 5000;
        x -= count5000;

        count1000 = Math.min(y / 1000, x);
        y -= count1000 * 1000;
        x -= count1000;

        if (x == 0 && y == 0) {
            return new int[]{count1000, count5000, count10000};
        } else {
            return null;
        }
    }
}
