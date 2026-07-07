package Recursion;
import java.util.*;
public class onetoN {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(1,n);

    }
    static void print(int x,int n)
    {
        if(x>n) return;
        System.out.println(x);
        print(x+1,n);
    }
}
