package BInary_Search;

public class SingleAmongDouble {

    static int findOnce(int[] arr) {

        int n = arr.length;

        // if array has only one element
        if (n == 1)
            return arr[0];

        // check first element
        if (arr[0] != arr[1])
            return arr[0];

        // check last element
        if (arr[n - 1] != arr[n - 2])
            return arr[n - 1];

        int lo = 0;
        int hi = n - 1;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            // single element found
            if (arr[mid] != arr[mid - 1] &&
                    arr[mid] != arr[mid + 1]) {

                return arr[mid];
            }

            int f = mid;
            int s = mid;

            // finding pair indexes
            if (arr[mid - 1] == arr[mid]) {
                f = mid - 1;
            } else {
                s = mid + 1;
            }

            int leftCount = f - lo;
            int rightCount = hi - s;

            // decide search side
            if (leftCount % 2 == 0) {
                lo = s + 1;
            } else {
                hi = f - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3,4, 5, 5,6,6};

        int ans = findOnce(arr);

        System.out.println("Single element is: " + ans);
    }
}