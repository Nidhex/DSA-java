package Arrays;
import java.util.*;
public class MissinginaArray {
    static void main() {
        int [] arr = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        int n = arr.length+1;
//        System.out.println(n);
        int sum =n*(n+1)/2;
        int  arrsum = 0;
        for(int ele: arr){
            arrsum +=ele;
        }
        System.out.println(sum - arrsum);
    }
}
