package day4;

import java.util.Scanner;
public class N25405Fix {
    public static void main(String[] args) {
        Scanner nsc = new Scanner(System.in);

        int X = nsc.nextInt(); //총 금액
        int N = nsc.nextInt(); //구매한 물건 종류 개수

        int b[][] =new int[N][2];
        int total = 0 ;

        for (int i = 0; i < b.length; i++) {
            b[i][0] = nsc.nextInt();
            b[i][1] = nsc.nextInt();
            total += b[i][0] * b[i][1];
        }


        if (total==X){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
