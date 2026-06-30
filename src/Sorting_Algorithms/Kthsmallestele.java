package Sorting_Algorithms;
import java.util.*;
public class Kthsmallestele {
    static void main() {
        int [] arr = {7,10,4,3,20,15};
        int k =3;

        int n = arr.length;
        for (int i = 0; i < k; i++) {
            int min = Integer.MAX_VALUE;
            int mindex = -1;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min = arr[j];
                    mindex =j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;

        }
        System.out.println(arr[k-1]);


    }
}
