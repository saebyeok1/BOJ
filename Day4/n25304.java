package Day4;

import java.util.Scanner;
public class n25304 {
    public static void main(String[] args) {
        Scanner nsc = new Scanner(System.in);

        int X = nsc.nextInt(); //총 금액
        int N = nsc.nextInt(); //구매한 물건 종류 개수

        for (int i = 0; i < N; i++) {
            int a = nsc.nextInt(); //각 물건의 가격
            int b = nsc.nextInt(); //개수

            X = X - (a * b);
        }

        if (X==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
