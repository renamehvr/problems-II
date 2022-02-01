public class test {


    public static void main(String[] args) {
        int[][] A = {{1,2,3} , {4,5,6} , {7,8,9}};
        int N = A.length;
        int[][] B = new int[2*N-1][N];
        int x; int y;
        //first print all the diagonal which are starting from 0th row

        for (int j = 0; j < N ; j++) {
            int[] C = new int[N];
            x=0;
            y=j;
            int ci=0;
            while(x<N && y>=0 ){
                C[ci++] = A[x][y] ;
                x++;y--;
            }
            B[j] = C;
        }

        //now we need to do get diagonal which are starting from last columns
        // we are starting i with 1 as i=0 ie row 0th's diagonal we have included in last loop
        int t = N;
        for (int i = 1; i <  N ; i++) {
            int[] C = new int[N];
            x=i;
            y=N-1;
            int ci=0;
            while(x < N && y>=0 ){
                C[ci++] = A[x][y] ;
                x++;y--;
            }
            B[t++] = C;
        }


        for (int i = 0; i < N ; i++) {
            for (int j = 0; j <A.length; j++) {
                System.out.print(B[i][j]);
            }
            System.out.println();
        }

    }
}
