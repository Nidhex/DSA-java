package Recursion;
import  java.util.*;
public class countdigit {
    static void main() {
        int n = 13456452;
        System.out.print(counter(n));
    }
    static int counter(int n){
        if(n==0) return 0;


        return 1+counter(n/10);
    }
}

