import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;

public class ZeroSumSAcheck {
    public static void main(String[] args) {
        int[] A = {1,-1};
                //{1,2,3,4,5};

        //create prefix sum
        int[] pfsum = new int[A.length];
        //    HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        pfsum[0] = A[0];
        set.add(pfsum[0]);

        for(int i=1 ; i < A.length ; i++){
            pfsum[i] = pfsum[i-1] + A[i];
             set.add(pfsum[i]);
        }

        if(IntStream.of(pfsum).anyMatch(myMatch -> myMatch==0) || IntStream.of(A).anyMatch(match->match==0)) {
            System.out.println("yes there is atleast one subarray with sum = 0");
        }

       else if(set.size() < pfsum.length){
            System.out.println("yes there is atleast one subarray with sum = 0");
        }
        else System.out.println("No there is no subarray present with sum = 0 ");

        for(int a: pfsum){
            System.out.print(a+" ");
        }

    }
}
