import java.util.*;
import java.io.*;

public class Main {
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int power = scn.nextInt();
        int ans = pow(number, power);
        System.out.println(ans);
    }

    public static int pow(int n, int p) {

        if(p==0) return 1;

        int halfPower = pow(n, p/2);
        int answer = halfPower*halfPower;

        if((p&1)==1) answer = answer*n;

        return answer;
    }
}