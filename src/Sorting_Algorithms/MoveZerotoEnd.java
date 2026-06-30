package Sorting_Algorithms;
import  java.util.*;
public class MoveZerotoEnd {
    public  static void print(int [] arr)
    {
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
    }

    static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 4, 0, 5, 6, 0, 7};
        int n = arr.length;
        System.out.println("orignal array");
        print(arr);
        System.out.println();

        for (int i = 0; i < n-1; i++) {
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]==0)
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        print(arr);



    }
}
