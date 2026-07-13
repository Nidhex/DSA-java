package Recursion;
import java.util.*;
public class oddno {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);

    }
    static  void print(int n){
        if (n % 2 != 0) System.out.println(n);
        if(n==1) return;
        print(n-1);
    }
}
