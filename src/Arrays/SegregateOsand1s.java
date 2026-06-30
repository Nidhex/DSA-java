package Arrays;
import java.util.*;
public class SegregateOsand1s {
    static void main() {
    int[] arr = {1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1};
    /// by two pointer technique;
        int n = arr.length;
        int i = 0;
        int j = n-1;
       while (i<j){
           if(arr[i] ==0 ) i++;
           if (arr[j]==1) j--;
           if(i<j)  // becoz of some test case
           if(arr[i]== 1 && arr[j]==0){
               arr[i] =0;
               arr[j] =1;

               i++;
               j--;

           }
       }
           for(int ele:arr){
               System.out.print(ele+" ");
           }
///method 2;
//    int numberofzero =0;
//    int numberofone =0;
//    for(int ele: arr)
//    {
//        if(arr[ele] == 0) numberofzero++;
//        else numberofone++;
//
//    }
//        for (int i = 0; i <numberofzero; i++) {
//            arr[i] = 0;
//
//        }
//        for(int j =numberofzero;j< arr.length;j++)
//        {
//            arr[j] = 1;
//
//        }
//        for(int ele: arr)
//        {
//            System.out.print(ele+" ");
//        }
    }
}
