package Sorting_Algorithms;
import java.util.*;
public class   pairofSum {
    public static void print(int []arr){
        for(int ele:arr){
            System.out.println(ele);
         }
    }
    static void main() {
        int[] arr = {12, 7, 15, 3, 9, 21, 6, 18, 11, 14};
        int target = 27;
        int n = arr.length;

         Arrays.sort(arr);


       int  i=0;
       int j=n-1;

       while (i<j){
           if (arr[i]+arr[j]==target)  {
               System.out.println(arr[i] + "+" + arr[j] + "=" + target);
               break;
           }

           else if (arr[i]+arr[j]>target) j--;
           else if (arr[i]+arr[j]<target) i++;


       }


    }
}
