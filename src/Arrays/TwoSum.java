package Arrays;
import java.util.*;
public class TwoSum

{
   public static void main(String[] args)
   {
       int [] arr = {4, 12, 7, 15, 9, 21, 3, 18, 25, 6, 14, 11};
       int target = 30;
       for (int i = 0; i < arr.length; i++)
       {
           for(int j=i+1;j<arr.length;j++)
           {
               if (arr[i] + arr[j] == target)
               {
                   System.out.println("At the index" + i + "," + j + "the TwoSumis " + arr[i] + "+" + arr[j] + "=" + target);
               }
           }
       }
   }


}

