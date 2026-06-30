package Arrays;
import java.util.*;
public class maxelementinarray
{
    static void main() {
        Scanner sc = new Scanner(System.in);
        int [] arr = {12,3,456,778,99,0,66,445};
        int max = arr[0];
        for (int i = 0; i <arr.length ; i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
