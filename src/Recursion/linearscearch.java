package Recursion;
import java.util.*;
public class linearscearch {
    static void main() {
    int[] arr = {1,2,3,4,5,6,7,8,98};
    int ele = 76;
        System.out.println(exists(arr,ele,0));
    }
    public static boolean exists(int[]arr,int target,int idx)
    {
        if(idx == arr.length) return false;
        if(arr[idx] == target)  return true;
        return exists(arr,target,idx+1);
    }

}
