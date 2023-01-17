package day6;

import java.util.Scanner;
public class N2439 {
    public static void main(String[] args) {
        Scanner nsc = new Scanner(System.in);
        int num = nsc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int k = num; k >0; k--) {
                if (k > i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
