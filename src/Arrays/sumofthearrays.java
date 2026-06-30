// print the sum of thr arrays
package Arrays;
import java.util.*;
public class  sumofthearrays
{
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int x = sc.nextInt();
        int[] arr = new int[x];
        for (int i = 0; i < x; i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum =0;
        for(int j =0;j<x;j++)
        {
        sum +=arr[j];
        }
            System.out.println(sum);
    }
}
