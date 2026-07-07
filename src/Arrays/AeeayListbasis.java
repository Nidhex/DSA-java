package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class AeeayListbasis {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(25);
        arr.add(21);
        arr.add(18);
        arr.add(5);
        arr.add(10);

        // get()
        System.out.println(arr.get(2));

        // set()
        arr.set(3, 50);
        System.out.println(arr.get(3));

        System.out.println(arr);

        int n = arr.size(); // size of arraylist

        // traversal
        for (int i = 0; i < n; i++) {
            System.out.println(arr.get(i));
        }

        // add()
        arr.add(78);

        // add at index
        arr.add(1, 100);

        System.out.println(arr);

        // remove last element
        arr.remove(arr.size() - 1);

        System.out.println(arr);

        int i = 0;
        int j = arr.size() - 1;

        // another ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        // input in ArrayList
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> inputList = new ArrayList<>();

        for (int k = 0; k < 5; k++) {
            inputList.add(sc.nextInt());
        }

        System.out.println(inputList);

        // traversal of inputList
        for (int k = 0; k < inputList.size(); k++) {
            System.out.println(inputList.get(k));
        }


    }
}