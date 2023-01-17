package day6;

import java.util.Scanner;

public class N2440 {
    public static void main(String[] args) {
        Scanner nsc = new Scanner(System.in);
        int num = nsc.nextInt();

        for( int i = 0; i<num; i++){
            for (int k =num; k>i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
