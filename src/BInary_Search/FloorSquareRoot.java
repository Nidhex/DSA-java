package BInary_Search;
import java.util.*;
public class FloorSquareRoot {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ///brute force

        // int root =0;
//        for (int i = 0; i < n; i++) {
//            if (i * i > n) break;
//            root = i;
//
//        }
//        System.out.println("the perfect square of "+n+ " is "+root);
        /// binary search

        int low = 1, high = n;
         while (low<=high){
             int mid = (low+high)/2;
             if(mid*mid == n)  System.out.println("the perfect square of "+n+ " is "+mid);
             if(mid*mid>n) high = mid -1;

             else low = mid +1;



         }

    }


}
