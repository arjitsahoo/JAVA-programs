import java.util.*;

class transposeMatrix {

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] findTranspose(int[][] matrix, int r, int c) {
        int[][] ans = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }

    static void transposeInPlace(int[][] matrix, int r, int c) {

        for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {
                // swap matrix elements
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    static void reverseArray(int[] arr) {
        int i = 0, j = arr.length-1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }

    static void rotate(int[][] matrix, int n){
        transposeInPlace(matrix, n, n);

       for(int i=0; i<n; i++){
         reverseArray(matrix[i]);
       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int r = sc.nextInt();
        System.out.println("Enter no of columns");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter " + r * c + " Elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printMatrix(matrix);

        //System.out.println("Transpose Matrix");
        // int[][] ans= findTranspose(matrix, r, c);
        // printMatrix(ans);

        //transposeInPlace(matrix, r, c);
        //printMatrix(matrix);

        System.out.println("Rotated matrix");
        rotate(matrix, r);
        printMatrix(matrix);
    }
}