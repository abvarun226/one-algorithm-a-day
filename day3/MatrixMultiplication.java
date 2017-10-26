/*
    Matric Multiplication
    =====================

    Time Complexity: O(xyz)
    If x = y = z = n, then, O(n^3)
    Cubic Algorithm

*/

public class MatrixMultiplication {
    static void printArray(int[][] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            int m = arr[i].length;
            for(int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {2, 1, 5},
            {7, 8, 5}
        };
        int[][] B = {
            {3, 6, 7},
            {2, 8, 6},
            {5, 9, 1}
        };
        int x = A.length;
        int y = A[x-1].length;
        int z = B[x-1].length;

        int[][] C = new int[x][z];

        for(int i = 0; i < x; i++) {
            for(int j = 0; j < y; j++) {
                C[i][j] = 0;
                for(int k = 0; k < z; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        printArray(C);
    }
}
