package day7;

import java.util.Scanner;

public class N10808 {
    public static void main(String[] args) {
        Scanner nsc = new Scanner(System.in);

        String insert = nsc.nextLine();
        int[] alpha = new int[26];

        for (int i = 0; i < insert.length(); i++) {
            char a = insert.charAt(i);
            alpha[a - 'a']++;
        }
        for (int k = 0; k < 26; k++) {
            System.out.print(alpha[k]+" ");
        }
    }
}
