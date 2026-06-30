package Arrays;
import java.util.*;
public class SecondMaxelement {
    static void main(String[] args) {
        int[] arr = {45, 12, 78, 34, 89, 23, 67, 89, 56, 90, 11, 90, 44};

        int max = arr[0];
        int second_max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }

        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > second_max && arr[j]!=max) {
              second_max = arr[j];
            }
        }
        System.out.println(second_max);
    }
}

