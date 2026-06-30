package Arrays;
import java.util.*;
public class shalloecopyDeepcopy {
    static void main() {
        int[] arr = {10,20,30,40};
//        int[] x = arr; // shallow copy
//        x[0] =100;
//        System.out.println(arr[0]);

        int[] y = Arrays.copyOf(arr,arr.length); //deep copy
        y[0] =100;
        System.out.println(y[0]);
        System.out.println(arr[0]);

    }
}
