package Sorting_Algorithms;
import java.util.*;
public class SelectionSortLargest {
    public static  void print(int []arr)
    {
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
    }
    static void main() {
        int [] arr = {5,-2,6,7,2,0,7,2};
        int n = arr.length;
        System.out.println("orignal array");
        print(arr);
        System.out.println();

        for (int i = n-1; i >0 ; i--){
            int max = Integer.MIN_VALUE;
            int index =0;
            for(int j=0;j<=i;j++)
            {
              if(arr[j]>max)
              {
                  max =arr[j];
                  index = j;

              }
            }
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;

        }
        print(arr);


    }
}
