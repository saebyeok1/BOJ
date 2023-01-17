package day7;

import java.util.Scanner;

public class N10039 {
    public static void main(String[] args) {
        Scanner nsc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int score = nsc.nextInt();
            if (score > 40) {
                sum += score;
            } else {
                sum += 40;
            }
        }
        int avg = sum / 5;
        System.out.println(avg);

    }
}
