import java.util.*;
import java.io.*;

public class Main  {
    public static void main(String... args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printIncreasing(n);
    }

    public static int printIncreasing(int n) {
        if(n==0) return 0;
        printIncreasing(n-1);
        System.out.println(n);
        return 0;
    }
}