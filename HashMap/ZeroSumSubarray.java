/*
Des - Given an array A of N integers. Find the largest continuous sequence in a array which sums to zero.
1 <= N <= 10^6
-10^7 <= A[i] <= 10^7

Output= Return an array denoting the longest continuous sequence with total sum of zero.
NOTE : If there are multiple correct answers, return the sequence which occurs first in the array.
A = [1,2,-2,4,-4]
explain - [2,-2,4,-4] is the longest sequence with total sum of zero.

*/

import java.util.HashMap;

public class ZeroSumSubarray {
    public static void main(String[] args) {
        int[] A = {1, 2, -2, 4, -4};

    }
    public static  int[]  solve(int[] A){
        int N =A.length;
        int[] pfsum = new int[N];
        int max =-1; int key= -1;
        int[] res ;
        int[] temp;
        boolean flag=false;
        HashMap<Integer,int[]> map = new HashMap<>();
        pfsum[0] = A[0];
        for(int i=1 ; i < N ; i++){
            pfsum[i] = pfsum[i-1] + A[i];
            if(pfsum[i]==0){
                res = new int[i+1];
                System.arraycopy(A, 0, res, 0, i + 1);
                return res;
            }
        }
        for(int i=0 ; i < pfsum.length ; i++){
            if(map.containsKey(pfsum[i])){
                flag=true;
                temp = map.get(pfsum[i]);
                if(temp[1] ==-1){
                    temp[1] = i;
                }
                else if(temp[1] < i) temp[1] = i;

                if(temp[1]-temp[0] > max){
                    max =  temp[1]-temp[0];
                    key = pfsum[i];
                }
            }
            else {
                int[] c = new int[2];
                c[0] = i;
                c[1] = -1;
                map.put(pfsum[i], c);
            }
        }
        //System.out.println(key+"  "+map.get(key));
        if(flag){
            temp = map.get(key);
            int j=0;
            res = new int[temp[1]-temp[0]];
            for(int i=temp[0]+1 ; i <=temp[1] ; i++){
                res[j++] = A[i];
            }
            return res;
        }
        int[] p = new int[1];
        return p;
    }
}
