import java.util.Arrays;
import java.util.Collections;

/*
all problem based on sorting implemented here
problems are -
1. noble number  - number less than it = number itself   //no same elements
2.
3.


 */
public class SortingProblems {
    public static void main(String[] args) {
        int[] A = {100, -10, -5, 1, 3, 4, 5, 10};
        int[] B={-3,0,2,2,5,5,5,5,8,8,10,10,10,14};
        int[] C={-4, -2, 0, -1, -6 };   //{-10,1,1,1,4,4,4,7,10};
    //    nobeldistinct(A);
       // nobelNondistinct(C);
        greaternobel(C);
    }

    public static void nobeldistinct(int[] A) {
        int less = 0;
        int cout = 0;
        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < A.length; i++) {
            if (A[i] == i) {
                cout++;
            }
        }
        System.out.println(cout);

    }

    public static void nobelNondistinct(int[] A) {
        // int[] C={-10,1,1,1,4,4,4,7,10};
        int less = 0;
        int cout = 0;
        if(A[0]==0) cout++;
        for (int i = 1; i < A.length; i++) {
            if(A[i]!=A[i-1]){
                less = i;
            }
             if (A[i] == less) {
                cout++;
            }
            System.out.print(less+" :");
        }
        System.out.println(cout);

    }

    public static void greaternobel(int[] A) {
        // int[] C={-10,1,1,1,4,4,4,7,10};
        int less = 0;
        int cout = 0;
     //   Collections.reverse(Arrays.asList(A));
     //   System.out.println(Arrays.asList(A));
        Arrays.sort(A);
        rev(A);
        for(int a: A){
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.print(less+" ,");
        for (int i = 1; i < A.length; i++) {
            if(A[i]!=A[i-1]){
                less = i;
            }
            if (A[i] == less) {
                cout++;
                System.out.println(A[i]+" "+i);
            }
            System.out.print(less+" ,");
        }
        System.out.println(cout);

    }
    public static void rev(int[] A){
        int i, k, t;
        int n= A.length;
        for (i = 0; i < n / 2; i++) {
            t = A[i];
            A[i] = A[n - i - 1];
            A[n - i - 1] = t;
        }
    }
}
