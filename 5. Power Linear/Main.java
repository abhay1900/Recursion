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
        return n*pow(n, p-1);
    }
}