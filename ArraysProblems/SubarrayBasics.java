/*
Sub array basic operation we will perform in this

1.Print all the possible subarrays
2. count of all possible subarrays


 */
public class SubarrayBasics {
    public static void main(String[] args) {
        int[] A = {1, 2, 3,4};
        int count=0;
            for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(A[k]);
                }
                System.out.println();
                count++;
            }
        }
            int N=A.length;
        System.out.println("possible subset of array of length N="+N+" is "+count+" which is same as: N*N+1/2 = "+(N*(N+1)/2));
    }
    }

