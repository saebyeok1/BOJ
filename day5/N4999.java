package day5;

import java.util.Scanner;

public class N4999 {
    public static void main(String[] args) {
        Scanner nsc = new Scanner(System.in);

        String a = nsc.nextLine();
        String b = nsc.nextLine();

        if (a.indexOf("h") >= b.indexOf("h")) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }

    }
}
