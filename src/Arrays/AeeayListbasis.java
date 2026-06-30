package Arrays;
import java.util.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class
AeeayListbasis {
    static void main() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(18);
        arr.add(5);
        arr.add(10);

        System.out.println(arr.get(2));
        arr.set(3,50);
        System.out.println(arr.get(3));

        System.out.println(arr);

        int n = arr.size(); // arr.length

        for (int i = 0; i <n; i++) {
            System.out.println(arr.get(i));

        }

            arr.add(78); // 25 21 18 50 10 78
            arr.add(1,100);//25 100 21 18 50 10 78\

        System.out.println(arr);
        arr.remove(arr.size()-1);
        System.out.println(arr);

        int i=0, j=arr.size()-1;


    }
}
