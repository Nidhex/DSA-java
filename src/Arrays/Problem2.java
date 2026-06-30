//Ques: Multiply odd indexed elements by 2 and add 10 to even indexed elements

package Arrays;
import java.util.*;
public class Problem2
{
    static  void change(int []arr)
    {
        for (int i = 0; i <arr.length; i++)
        {
            if(i%2 ==0)
            {
                arr[i] += 10;
            }
            else
            {
                arr[i] *= 2;
            }
        }

    }



    static  void print(int []arr)
    {
        for (int i = 0; i <arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }


    public  static void main(String[] args)
    {
          int [] arr = {1,3,22,54,7,6,80,5};
        change(arr);
       print(arr);
    }
}
