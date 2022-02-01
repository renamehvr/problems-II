public class TwoDArrays {
    public static void main(String[] args) {
        int[][] A = {{3,8,9,2} , {1,2,3,6} , {4,10,11,17}};
        int row = A.length;
        int col = A[0].length;
        int sum;
        int max=Integer.MIN_VALUE;
        System.out.println("printing row wise sum of 3X4 matrix");
        for (int i = 0; i < row; i++) {
            sum=0;
            for (int j = 0; j < col; j++) {
                sum = sum + A[i][j];
            }
            max = Math.max(sum,max);
            System.out.print(sum+"  ");
        }
        System.out.println("max out of this : "+max);
        System.out.println();
        System.out.println("printing col wise sum of 3X4 matrix");
        max=Integer.MIN_VALUE;
        for (int j = 0; j < col; j++) {
            sum = 0;
            for (int i = 0; i < row; i++) {
                sum += A[i][j];
            }
            System.out.print(sum+"  ");
            max = Math.max(sum,max);
        }
        System.out.println("Max col sum :"+max);
        System.out.println(" print all Diagonals ");

        int[][] B = {{1,2,3} , {4,5,6} , {7,8,9}};
        int t = 2*B.length -1;
        int[][] C=new int[t][B[0].length];
      //  int[] c = new int[3];
        for (int j = 0; j < B.length ; j++) {
            int[] c = new int[B.length];
            int x = 0;
            int y=j;
            int ci=0;
            while( x<B.length  && y>=0){
                c[ci++] = B[x][y];
              //  System.out.println("x , y "+x+y);
                x++;y--;
            }
        //    System.out.println(c);
            C[j] = c;
        }
        int N = B.length;


        for (int i = 1; i <  B.length ; i++) {
            int[] c = new int[B.length];
            int x=i;
            int y=B.length-1;
            int ci=0;
            while(x<B.length && y>=0){
                c[ci++] = B[x][y];
                y--;x++;
            }
            C[N++] = c;
        }

        for (int i = 0; i < N ; i++) {
            for (int j = 0; j <B.length; j++) {
                System.out.print(C[i][j]);
            }
            System.out.println();
        }

    }}
