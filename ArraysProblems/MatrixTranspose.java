public class MatrixTranspose {
/*
31/01/2022
rotation of matrix by 90^
first do Transpose of matrix
then reverse each row

 */

    public static void swap(int[][] A , int i , int j){
        int temp = A[i][j];
        A[i][j] = A[j][i];
        A[j][i] = temp;
    }

    public static void reverse(int[] A){
        int N = A.length;
        for (int i = 0 , j=N-1; i < j ; i++ , j--) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
    }
    public static void printMatrix(int[][] A){
        for (int i = 0; i < A.length ; i++) {
            for (int j = 0; j <A.length; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       // int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] A = {{1, 2}, {3,4}};
        System.out.println("==================Matrix before  transpose ==============");
        printMatrix(A);
//finding transpose of a matrix without using extra N space
        System.out.println("==================Matrix after transpose ==============");
        for (int j = 1; j < A.length; j++) {
            int x = 0;
            int y = j;
            while (x < y) {
                swap(A, x, y);
                x++;
            }
        }
        printMatrix(A);
        System.out.println("==================Matrix after reversing each row of last matrix ==============");
        for (int i = 0; i < A.length; i++) {
            reverse(A[i]);
        }
        printMatrix(A);
        System.out.println("==================Final matrix is 90* Clockwise rotated matrix of OG one ==============");

    }
}
