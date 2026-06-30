package twoDArray;
import java.util.*;
public class basisof2d {
    static void main() {
        Scanner sc = new Scanner(System.in);

      //  int [][] arr = new int[3][4];
        int [][]arr = {{1,2,3,4,21},{5,6,7,8,42},{9,7,5,3,54}};
        System.out.println(arr.length+" "+arr[0].length);
        for (int i = 0; i < arr.length; i++) {
            for(int  j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int [][]arr2 = new int[3][3];
        for (int i = 0; i < arr2.length; i++) {
            for (int j=0;j<arr2[0].length;j++){
                arr2[i][j] = sc.nextInt();
            }

        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j=0;j<arr2[0].length;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            for(int  j=0;j<arr[0].length;j++){
               sum += arr[i][j];
            }
            System.out.println();
        }
        System.out.println(sum);

    }




}
