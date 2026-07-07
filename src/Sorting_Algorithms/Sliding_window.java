package Sorting_Algorithms;
import java.util.*;
public class Sliding_window {
    static void main() {

            int[] arr = {2,1,5,1,3,2};
            int k = 3;

            int sum = 0;

            // first window
            for(int i = 0; i < k; i++) {
                sum += arr[i];
            }

            int maxSum = sum;

            // slide window
            for(int i = k; i < arr.length; i++) {

                sum = sum - arr[i - k] + arr[i];

                maxSum = Math.max(maxSum, sum);

            }

            System.out.println(maxSum);

        }
}


