package Recursion;
import  java.util.*;
public class factorialOFnum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact(n);
        System.out.println(fact(n));
    }

    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int ans = n * fact(n - 1);
        return  ans;
    }
}
