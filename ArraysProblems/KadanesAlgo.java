public class KadanesAlgo {
    public static void main(String[] args) {
        int[] A = {3,5,-9,1,3,-2,3,4,7,2,-9,6,3,1,-5,4};
        int N = A.length;
        int presentMax=A[0];
        int maxOfmax=presentMax;
        for (int i = 1; i < N; i++) {

            presentMax = Math.max(presentMax+A[i] , A[i]);
            maxOfmax = Math.max(presentMax,maxOfmax);

        }
        System.out.println(maxOfmax);
    }
}
