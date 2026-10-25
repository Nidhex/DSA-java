




package Sorting_Algorithms;
import java.util.*;
public class BubbleSort{
    public  static void print(int [] arr)
    {
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
    }
    static void main() {
        int [] arr = {5,-2,6,7,2,0,7,2};
        int n = arr.length;
        System.out.println("Orignal array:");
        print(arr);
        System.out.println();

//        for(int i=0; i<n-1;i++){
//            for (int j = 0; j <n-1; j++) {
//                if(arr[j]>arr[j+1])
//                {
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//
//        }

        ///Bubble sort optimized
        for(int i=0; i<n-1;i++){

            int swaps =0;
            for (int j = 0; j <n-1; j++) {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if(swaps==0) break;
        }
        System.out.println("Sorted array(Bubble):");
        print(arr);


    }
}