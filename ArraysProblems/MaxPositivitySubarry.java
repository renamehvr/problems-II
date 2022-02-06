public class MaxPositivitySubarry {
    public static void main(String[] args) {
        int si=0;
        int ei=0;
        int maxlen=0;
        int count=0;
        int[] A = {-3674875, 5305422, 7665178, 205505, -7168198, -1398091, 5392310, -1700856, 1259052, -3056006};
        for(int i=0 ; i < A.length ; i++){
            if(A[i] >=0){
                count++;
                if(count>maxlen){
                    ei=i;
                    maxlen = Math.max(maxlen,count);
                }
            }
            else count=0;
        }

        int[] res = new int[maxlen];
        si=ei-maxlen+1;
        for(int i=0 ; i < maxlen ; i++){
            res[i] = A[si];
            si++;
        }
   System.out.println(ei);
        System.out.print("[");
    for(int a : res){
        System.out.print(a+" ");
    }
        System.out.print("]");
    }
}
