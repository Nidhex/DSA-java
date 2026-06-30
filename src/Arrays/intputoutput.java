package Arrays;
import java.util.*;
public class intputoutput
{
    static void main() {
        Scanner sc = new Scanner(System.in);
// output
//        int [] arr = {1,2,3,4,5,6};
//        int n = arr.length;
//        for (int i = 0; i < n; i++)
//        {
//            System.out.println(arr[i]);
//        }
//
//
//        System.out.println();


//Defalult values
//        int [] k = new int[7];
//        for (int i = 0; i < k.length ; i++)
//        {
//            System.out.print(k[i]);
//        }

// input

//        int [] k = new int[7];
//
//        for (int i = 0; i < 7 ; i++)
//        {
//            k[i] = sc.nextInt();
//        }
//
//        for (int i = 0; i < k.length ; i++)
//        {
//            System.out.println(k[i]);
//        }
//


//ques 1;
int []a = new int[8];
        for (int i = 0; i < a.length ; i++)
        {
         a[i] = sc.nextInt();
        }

        for(int j=0;j<a.length;j++)
        {

            System.out.print(a[j]*2+ " ");
        }
        System.out.println(a[0]);
    }

}
