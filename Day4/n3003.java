package Day4;

import java.util.Scanner;
public class n3003 {
    public static void main(String[] args) {
        Scanner nsc = new Scanner(System.in);

        int [] chess = new int[6];
        int [] total = new int[]{1,1,2,2,2,8};

        for (int i = 0; i < 6; i++) {
           chess[i] = nsc.nextInt();
        }

        for (int i = 0; i < total.length; i++) {
            chess[i] = total[i]-chess[i];
            System.out.print(chess[i]+" ");
        }

    }
}
