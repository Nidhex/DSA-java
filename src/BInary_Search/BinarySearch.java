package BInary_Search;
import java.util.*;
public class BinarySearch {
    static void main() {
        int []arr = {-1,0,3,5,9,12};
        int tar = 9;
        int n = arr.length;
        int low = 0 , high = n-1;

        while(low<=high){
           int   mid = (low+high)/2;
            if(arr[mid]>tar){
                high = mid-1;
            }
            else if (arr[mid]<tar) {
                low = mid+1;
            } else if (arr[mid] == tar) {
                System.out.println("target found at index "+mid );
                break;
            }
        }

    }
}
