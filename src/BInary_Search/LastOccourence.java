package BInary_Search;
import java.util.*;
public class LastOccourence {
    static void main(String[] args){
        int [] arr = {1, 1, 2, 2, 2, 3, 4, 5, 5, 5, 6, 7, 8, 11};
        int tar = 5;
        int index = -1;
        int n = arr.length;
        int low =0 , high =n-1;
        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>tar){
                high = mid-1;
            }
            else if (arr[mid]<tar) {
                low = mid+1;
            } else if (arr[mid] == tar) {
                index = mid;
                low = mid+1;
            }
        }
        System.out.println(index);
    }
}

