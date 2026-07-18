package Merge_Sort;
import java.util.*;
public class MergeFunction {
    public static void mearge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        ;

        //compare elemente in both arrays
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }

        }
        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }

    }
      public  static void main () {
            int[] a = {2, 5, 8};
            int[] b = {1, 3, 7, 9};

            // size of a meraged array
            int[] c = new int[a.length + b.length];
            mearge(a, b, c);

            for (int ele : c) {
                System.out.print(ele + " ");
            }
        }

}

