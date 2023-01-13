package user;
import java.util.Scanner;
public class N4999 {
    public static void main(String[] args) {
        Scanner nsc = new Scanner(System.in);

        String a = "aaah";
        System.out.println(a);
        String b = nsc.nextLine();

        if(a.equals(b) || a.length()<b.length()){
            System.out.println("no");
        }else {
            System.out.println("go");
        }
    }
}
