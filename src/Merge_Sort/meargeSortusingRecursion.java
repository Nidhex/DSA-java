package Merge_Sort;
/// Time complexsiy od mearge sort is nlogn
import java.util.*;
public class meargeSortusingRecursion {
    static void main() {
        int [] arr = {5,2,8,4,1,6,7,3,-5};
        mergeSort(arr);
        for(int ele:arr) System.out.print(ele+ " ");
    }
    private static void mergeSort(int []arr ){
        int n = arr.length;
        // base case
        if(n==1) return; // 1 length array is pahale se  sorted

        /// step 1: create 2 empty arrays of n/2 each
        int []a =new int[n/2];
        int []b  =new int[n-n/2];

        ///step2 : copy-paste arr  into a and b
        int idx =0;  // idx treavel karaga arr pe
        for (int i = 0; i <a.length; i++)  a[i] = arr[idx++];
        for (int i = 0; i <b.length; i++)  b[i] = arr[idx++];

        ///step 3 : magic
        mergeSort(a);  mergeSort(b);

        /// step 4: meargge a and b into arr
        merge(a,b,arr);
    }
    public static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j])
                c[k++] = a[i++];
            else
                c[k++] = b[j++];
        }

        while (i < a.length)
            c[k++] = a[i++];

        while (j < b.length)
            c[k++] = b[j++];
    }


}
