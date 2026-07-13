package Recursion;
import java.util.*;
public class reveseofnumber {

    public  static int revese(int n,int r ){
        if(n==0) return r;
        return revese(n/10,r*10+n%10);
    }


    static void main() {
        int n =1234;
       // int r=0;
//        while(n!=0){
//            r*=10;
//            r+=(n%10);
//            n/=10;
//
//        }
        System.out.println(revese(n,0));




    }

}
