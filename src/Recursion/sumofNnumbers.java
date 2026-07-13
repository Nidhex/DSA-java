package Recursion;
import java.util.*;
public class sumofNnumbers {
    static void main() {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        sum(n);
        System.out.println(sum(n));
    }

    public  static  int sum(int n ){
        if(n ==1) return 1;
        return  n + sum(n-1);
    }
}
