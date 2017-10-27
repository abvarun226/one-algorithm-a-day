
/*
    1-Dimensional Peak Finder
    =========================

    Time Complexity: O(logn)
    https://ocw.mit.edu/courses/electrical-engineering-and-computer-science/6-006-introduction-to-algorithms-fall-2011/lecture-videos/lecture-1-algorithmic-thinking-peak-finding/
*/

public class PeakFinder1D {
    public static void peakFinder(int[] arr, int l, int r) {
        int n = arr.length;
        if(r - l < 2) {
            return;
        }
        int m = (l + r) / 2;
        if(arr[m] > arr[m-1] && arr[m] > arr[m+1]) {
            System.out.println("Peak = " + arr[m]);
        }
        peakFinder(arr, l, m);
        peakFinder(arr, m, r);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 3, 7, 9, 8};
        peakFinder(arr, 0, arr.length - 1);
    }
}
