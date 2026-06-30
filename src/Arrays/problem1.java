//print -ve element only
package Arrays;
import java.util.*;
public class problem1
{
    static void main() {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,-3,5,-4,0,2,-6,7,6,-2};
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]<0)
            {
                System.out.println(arr[i]);
            }
        }

    }
}
