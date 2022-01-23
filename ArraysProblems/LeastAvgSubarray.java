/*
Return the index of the first element of the subarray of size k that has least average.
Array indexing starts from 0.

 */
public class LeastAvgSubarray {
    public static void main(String[] args) {
            int[] A = {15, 7, 11, 7, 9, 8, 18, 1, 16, 18, 6, 1, 1, 4, 18};
            int B=6;
            int lowest=Integer.MAX_VALUE;
            int ans=-1;
            int j,x,sum;
            for(int i=0 ; i < A.length ; i++){
                j=B;
                x=i;
                sum=0;
                while(j>0 &&  x+j <= A.length){
                    sum+=A[x];
                    x++;
                    j--;
                }
                if(j==0){
                    if(lowest>sum){
                        lowest=sum;
                        ans=i;
                    }
                }
            }
        System.out.println(ans);
        }
    }