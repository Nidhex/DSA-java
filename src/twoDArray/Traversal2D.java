//✓ Row-wise traversal
//✓ Column-wise traversal
//✓ Reverse traversal
//✓ Wave traversal
package twoDArray;
import java.util.*;
public class Traversal2D {
    static void main() {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
    ///row-wise traversal
        for(int i = 0; i < arr.length; i++) {

            for(int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();

        ///Column-wise traversal

        for(int j = 0; j < arr[0].length; j++) {

            for(int i = 0; i < arr.length; i++) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
        System.out.println();

        ///Reverse traversal
        for(int i = arr.length - 1; i >= 0; i--) {

            for(int j = arr[i].length - 1; j >= 0; j--) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
        System.out.println();
       /// Wave Traversal ⭐⭐⭐

        for(int i = 0; i < arr.length; i++) {

            if(i % 2 == 0) {

                for(int j = 0; j < arr[i].length; j++) {

                    System.out.print(arr[i][j] + " ");
                }
            }

            else {

                for(int j = arr[i].length - 1; j >= 0; j--) {

                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

        /// Reverse every row

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




    }
}
