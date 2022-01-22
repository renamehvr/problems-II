/*
Sub array basic operation we will perform in this

1.Print all the possible subarrays
2. count of all possible subarrays
3. printing sum of all subarrays


 */
public class SubarrayBasics {
    public static void main(String[] args) {
        System.out.println("************** Printing All possible Sub-arrays *************");
        int[] A = {1, 2, 3,4};
        int N=A.length;
        int sum;
        int count=0;
            for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print(A[k]+" ");
                }
                System.out.print("] ");
                //System.out.println();
                count++;
            }
        }
        System.out.println();

System.out.println("possible subset of array of length N="+N+" is "+count+" which is same as: N*N+1/2 = "+(N*(N+1)/2));
// As we already printed all the possible subarray in O(N^3) next we will print sum of all subarray
System.out.println("************** Printing Sum of Sub-arrays O(N^3) *************");

        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                sum=0;
                for (int k = i; k <= j; k++) {
                    sum+=A[k];
                }
                System.out.print(sum+" , ");
            }
        }
        System.out.println();
// next is to calculate sum of subarray starting from particular index
System.out.println(" sum of subarray starting from particular index ");
         sum=0;
        for (int i = 2; i < N ; i++) {
            sum+=A[i];
            System.out.print(sum+" ");
        }
        //System.out.println("Sum is "+sum);

//print sum of all subarrays using carry forward ; first all the subarray sum starting from index 0
        //[1] + [1,2] + [1+2+3] + [1,2,3,4] = 1 ,3 ,6 ,10;
        //then starting index = 1 and again same process by resetting sum =0;
        // in other words we are doing sum as 1 , then 1 + A[i] , last value +A[i]
System.out.println();
System.out.println("************** Printing Sum of Sub-arrays using carrysum O(N^2) *************");

        sum=0;
        for (int i = 0; i < N ; i++) {
            sum=0;
            for (int j = i; j < N ; j++) {
                sum+=A[j];
                System.out.print(sum+" ");
            }
        }

System.out.println();
System.out.println("************** Printing Max of Sub-arrays sum in O(N^2)   *************");
        sum=0;
        int maxsum=Integer.MIN_VALUE;
        for (int i = 0; i < N ; i++) {
            sum=0;
            for (int j = i; j < N ; j++) {
                sum+=A[j];
                //System.out.print(sum+" ");
                maxsum = Math.max(sum,maxsum);
            }
        }
        System.out.println("highest sum of any subarray that we can get is "+maxsum);

System.out.println();
System.out.println("************** Printing Sum of all Sub-arrays sum in O(N^2)   *************");
        sum=0;
        int totalSum=0;
        for (int i = 0; i < N ; i++) {
            sum=0;
            for (int j = i; j < N ; j++) {
                sum+=A[j];
                //System.out.print(sum+" ");
                totalSum+=sum;
            }
        }
        System.out.print("Sum of all Sub-arrays sum is :"+totalSum);
 System.out.println();
System.out.println("************ Printing Sum of all Sub-arrays sum in O(N) ************  ");
        long left=0;long right=0; long total = 0 ; long tsum=0;
        for(int i=0 ; i < A.length ; i++){
            left=i+1;
            right=N-i;
            total = left*right*A[i];
            tsum+=total;
        }
        System.out.print("Sum of all Sub-arrays sum is :"+tsum);

    }
    }

