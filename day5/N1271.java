package day5;

import java.math.BigInteger;
import java.util.Scanner;

public class N1271 {
    public static void main(String[] args) {
        Scanner nsc = new Scanner(System.in);
        BigInteger a = nsc.nextBigInteger();
        BigInteger b = nsc.nextBigInteger();
        System.out.println(a.divide(b));
        System.out.println(a.remainder(b));
    }

}
