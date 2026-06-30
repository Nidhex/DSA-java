package twoDArray;
import java.util.*;
public class maxrowsum {
    static void main() {
        int [][]arr = {{1,2,3,4,21},{5,6,7,8,42},{9,7,5,3,54}};
        int maxSum = Integer.MIN_VALUE;
        int row = -1;
        for (int i = 0; i < arr.length ; i++) {
            int sum =0;

            for(int j=0;j<arr[0].length;j++){
                sum+=arr[i][j];
            }
           // maxSum  = Math.max(maxSum,sum);
            if(sum>maxSum)
                maxSum = sum;
            row = i;


        }
        System.out.println(maxSum+" at row "+row);

    }

}
