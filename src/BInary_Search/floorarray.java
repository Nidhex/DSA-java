package BInary_Search;
import java.util.*;
public class floorarray {
    static void main() {
    int [] arr = {1, 2, 4, 10, 10, 12, 19};
    int n = arr.length;
    int tar = 5;
    int ind =-1;
    int low =0 , high =n-1;
    while (low<=high){
        int mid = (low+high)/2;
        if(arr[mid]>tar)high = mid-1;
        else if(arr[mid]<tar) low = mid+1;
        ind = mid;
    }
        System.out.println(arr[ind]+"at the index "+ind);

    }

}
