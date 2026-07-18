package Arrays;
import  java.util.*;
public class Rotate_array
{
    static void reverse(int [] arr,int i,int j)
    {
        while(i<j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return;
    }

    static void main() {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int d = 3;
        int n = arr.length;

        /// method 1
//        reverse(arr,0,n-1);
//        reverse(arr,0,n-d-1);
//        reverse(arr,n-d,n-1);

        ///method 2
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);

        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }




        }

    }

