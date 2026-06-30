//ques: check if array is sorted ?
package Sorting_Algorithms;
import java.util.*;
public class problem1 {

    static  boolean arrSortorNot(int [] arr)
    {
        for (int i = 0; i <arr.length-1 ; i++) {
           if(arr[i]>arr[i+1]) return false;
        }
        return true;


    }

    static void main(String[] args) {
        int [] arr = {1,2,3,4,5,12,7,8,9};

        System.out.println(  arrSortorNot(arr));


    }
}
