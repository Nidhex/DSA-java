package BInary_Search;
import java.util.*;
public class Mountainarrry {
    static void main() {
        int []arr ={1, 0, 1, 2, 5, 6, 8, 6, 3};

        int ind =-1;
        int n = arr.length;
        int high =n-2 , low = 1;
        while (low<=high) {
            int mid = (low+high)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1] ){
                System.out.println(mid+" = is a mountain peak");
                break;
            }
            else if(arr[mid]<arr[mid+1]&& arr[mid]>arr[mid-1]) {
                low = mid + 1;
            }
            else high = mid-1;


        }

    }
}
