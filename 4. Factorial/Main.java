import java.util.*;
import java.io.*;

public class Main {
    public static void main(String... args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        System.out.println("Factorial of " +n+ " is " +factorialOf(n));
    }

    public static int factorialOf(int n) {
        if(n==0 || n==1) return 1;
        return n*factorialOf(n-1);
    }
}