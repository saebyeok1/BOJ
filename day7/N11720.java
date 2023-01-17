package day7;

import java.util.Scanner;

public class N11720 {
    public static void main(String[] args){

        Scanner nsc = new Scanner(System.in);

        int num = nsc.nextInt();
        int sum=0;
        String a = nsc.next();

        for(int i=0; i<num; i++) {
            sum += a.charAt(i)-'0';
        }

        System.out.println(sum);
    }
}
 