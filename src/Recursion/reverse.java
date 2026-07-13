package Recursion;
import  java.util.*;
public class reverse {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = 12;
        reverse(n);
    }

    static int reverse(int n) {
        if (n == 0) return 0 ;
        System.out.print(n % 10);
      return   reverse (n / 10);
    }
}
