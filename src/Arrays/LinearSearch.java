package Arrays;
import java.util.*;
public class LinearSearch
{

    static int[] input(int []arr)
    {
        Scanner sc = new Scanner(System.in );


        for (int i = 0; i <arr.length; i++)
        {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        return arr;
    }



    static void main()
    {
        Scanner sc = new Scanner(System.in );

        System.out.println("Enter the size of an Array: ");
        int n = sc.nextInt();

        int [] arr = new int[n];
        input(arr);

        System.out.print("enter target: ");
        int x = sc.nextInt();

        int target=0;
        boolean flag = false ;
        for (int i = 0; i <arr.length; i++)
        {
         if(arr[i] == x)
         {
             flag = true; //
         target = i;
         break;

         }

        }

        if(flag) System.out.println("Target exist");
     else  System.out.println("Target  not exist");

     if(flag) System.out.println("element found at the index "+ target);
    }

}
