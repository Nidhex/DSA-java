package Recursion;
import java.util.*;
public class incressthendrecess {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
    static  void print(int n){
        if(n==0) return;
     //   System.out.println(n);
        print(n-1);
        System.out.println(n);
     //   print(n+1);
    }




}
