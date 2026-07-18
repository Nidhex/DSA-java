package Recursion;
import java.util.*;
public class TowerOFHanoi {
    static void main() {
        hanoi(5,'A','B','C');

    }
    private static void hanoi(int n,char src,char helper,char dest){
        if(n==0) return;
        /// n-1 disks form a to b via c
        hanoi(n-1,src,dest,helper);
        /// largest from a to c
        System.out.println(src+"->"+dest);
        ///n-1 disks from b to c via a
        hanoi(n-1,helper ,src,dest);


    }
}
