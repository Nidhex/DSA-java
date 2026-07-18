package Recursion;

public class recursiononArray {
    static void main() {
        int []arr = {1,2,3,4,5,67,89,34,5};
        recprint(arr,0);
    }
    static void recprint(int[]arr,int idx){
        if(idx == arr.length) return;
        System.out.println(arr[idx]); // prints
        recprint(arr,idx+1);
        System.out.println(arr[idx]); // reverse print
    }

}
