///two pointer technique
package Arrays;
import java.util.*;
public class Reverse_array{
    static void main() {
        int[] arr = {3,19,56,9,83,18,24,85,14};
        int n = arr.length;

        int i = 0;
        int j = n-1;
///      with for loop
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
/// with  for loop
//        for (int i = 0; i <n/2; i++) {
//             int temp =arr[i];
//             arr[i] = arr[n-1-i];
//             arr[n-1-i] = temp;
//             }


for(int ele: arr )
{
    System.out.print(ele+" ");
}

}


    }



