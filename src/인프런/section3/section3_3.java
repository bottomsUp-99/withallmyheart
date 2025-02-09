package 인프런.section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class section3_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer inforA = new StringTokenizer(br.readLine());
        StringTokenizer inforB = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            int a = Integer.parseInt(inforA.nextToken());
            int b = Integer.parseInt(inforB.nextToken());
            if (a == 1){
                switch (b){
                    case 1:
                        System.out.println("D");
                        break;
                    case 2:
                        System.out.println("B");
                        break;
                    case 3:
                        System.out.println("A");
                        break;
                }
            } else if (a == 2){
                switch (b){
                    case 1:
                        System.out.println("A");
                        break;
                    case 2:
                        System.out.println("D");
                        break;
                    case 3:
                        System.out.println("B");
                }
                } else {
                    switch (b){
                        case 1:
                            System.out.println("B");
                            break;
                        case 2:
                            System.out.println("A");
                            break;
                        case 3:
                            System.out.println("D");

                }
            }
        }
    }
}
