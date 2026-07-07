package Recursion;
import java.util.*;
public class even_numbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        print(n);

    }
    public  static  void print(int n ){
        if(n==0) return;
        if(n%2==0){
            System.out.println(n);

        }
        print(n-1);

    }
}
