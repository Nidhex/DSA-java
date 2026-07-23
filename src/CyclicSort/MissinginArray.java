package CyclicSort;

public class MissinginArray {

    public static void main(String[] args) {

        int[] arr = {5, 3, 1, 2, 6};

        int n = arr.length + 1;
        int i = 0;

        while (i < arr.length) {

            if (arr[i] == i + 1 || arr[i] == n) {
                i++;
            } else {
                int idx = arr[i] - 1;
                swap(arr, i, idx);
            }
        }

        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                System.out.println("Missing Number = " + (i + 1));
                return;
            }
        }

        System.out.println("Missing Number = " + n);
    }

    static void swap(int[] arr, int i, int idx) {

        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}