import java.util.*;
import java.io.*;

public class Main  {
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printDecreasing(n);
    }

    public static int printDecreasing(int n) {
        if(n==0) return 0;
        System.out.println(n);
        printDecreasing(n-1);
        return 0;
    }
}