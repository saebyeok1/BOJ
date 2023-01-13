package day5;

import java.util.Scanner;

public class N5522 {
    public static void main(String[] args) {
        Scanner nsc = new Scanner(System.in);
        int[] totalScore = new int[5];
        int sum = 0;


        for (int i = 0; i < totalScore.length; i++) {
            totalScore[i] = nsc.nextInt();
            sum += totalScore[i];
        }

        System.out.println(sum);
    }
}
