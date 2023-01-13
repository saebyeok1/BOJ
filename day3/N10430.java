package day3;

import java.util.Scanner;
public class N10430 {
    public static void main(String[] args) {
        Scanner nsc = new Scanner(System.in);
        int A = nsc.nextInt();
        int B = nsc.nextInt();
        int C = nsc.nextInt();

        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C) * (B%C))%C);
    }
}
