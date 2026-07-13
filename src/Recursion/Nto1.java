package Recursion;
import java.util.*;
public class Nto1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n,1);
    }
    static  void print(int n ,int x)
    {
        System.out.println(n);
        if(n==1) return;
         print(n-1,x);
    }
}
