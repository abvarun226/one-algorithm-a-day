import java.util.Arrays;

/*
    Time Complexity: logn  (for an already sorted array)
*/

public class BinarySearch {
    public static int search(int key, int[] arr) {
        int lo = 0;
        int hi = arr.length - 1;

        while(lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if(key == arr[mid])
                return mid;

            if(key < arr[mid])
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {8, 2, 3, 1, 6, 10, 100, 9, 4, 150, 1001};
        int key = Integer.parseInt(args[0]);

        Arrays.sort(arr);  // Necessary for BinarySearch. Complexity: nlogn

        int res = search(key, arr);
        if(res == -1)
            System.out.println("Key not Found!");
        else
            System.out.println("Key found in the array");
    }
}
