public class MajorityElement {
    public static void main(String[] args) {
        int[] A = {1,2,3,3,3,3};
        int freq=1;
        for (int i = 1; i < A.length; i++) {
            if(A[i-1] == A[i] ){
                freq++;
                if(freq>(A.length/2)){
                    System.out.println(A[i]);
                }
            }
            else freq=1;
        }
        // Moore's voter algo
        /*
        *   take element and its freq
        *   if elements in array  are distinct we need to perform delete operation
        * in delete we will decrease freq-- ;  and move forward the cursor
        *
        * if freq = 0   update element with A[i] and freq++;
        *
        * */
int ele=A[0];
freq = 1;
        for (int i = 1; i < A.length; i++) {
            if(freq ==0) ele = A[i];
           else if( ele != A[i]) {
               freq --;
            }
           else  freq++;
        }
        int count=0;
        for (int i = 0; i < A.length; i++) {
            if(A[i]==ele) count++;

            if(count > (A.length/2)+1) System.out.println("majority element is "+ele);;

        }
        System.out.println("no majority element");
    }
}
