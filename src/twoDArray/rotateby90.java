package twoDArray;

import java.util.*;

public class rotateby90 {

    static void print(int[][] arr) {

        for (int[] a : arr) {

            for (int ele : a) {
                System.out.print(ele + " ");
            }

            System.out.println();
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[][] arr = {
                {2, 8, 3, 4},
                {7, 2, 1, 6},
                {5, 5, 4, 1},
                {3, 1, 8, 2}
        };

        // Transpose matrix
        for (int i = 1; i < arr.length; i++) {

            for (int j = 0; j < i; j++) {

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Reverse every row
        for (int i = 0; i < arr.length; i++) {

            int start = 0;
            int end = arr[i].length - 1;

            while (start < end) {

                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;

                start++;
                end--;
            }
        }

        print(arr);
    }
}