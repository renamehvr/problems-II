public class BitManupulation {

    public static void main(String[] args) {
        String A;
        String B;
        B = "101001";
        A = "1110000000010110111010100100111";
        int alen = A.length();
        int blen = B.length();
        String c = "";
        int carry = 0;
        int sum = 0;
        int rem = 0;
        int N=0;
        int i = alen-1 ; int j = blen-1;
        while (i >=0 && j >=0){
           sum = Integer.valueOf(String.valueOf(A.charAt(i))) + Integer.valueOf(String.valueOf(B.charAt(j))) + carry;
           carry = sum/2;
           rem = sum % 2;
           c = rem+c;
           i--;j--;
        }
   //     N = i > j ? i : j;
        sum=0 ; rem =0;
        if(alen>blen){
            while (i >=0 ){
                sum = Integer.valueOf(String.valueOf(A.charAt(i))) + carry;
                carry = sum/2;
                rem = sum % 2;
                c = rem+c;
                i--;
            }
        }
        else if(blen>alen){
            while (j >=0 ){
                sum = Integer.valueOf(String.valueOf(B.charAt(j))) + carry;
                carry = sum/2;
                rem = sum % 2;
                c = rem+c;
                j--;
            }
        }
        if(carry>0) System.out.println(carry+c);
        else System.out.println(c);
        System.out.println("1110000000010110111010101010000".equals(c));

    }
    }



    /*

         if (alen >= blen) {
            for (int i = alen - 1 ,  j = blen-1 ;  j>=0 ; i-- , j--) {
                    sum = Integer.parseInt(String.valueOf(A.charAt(i))) + Integer.parseInt(String.valueOf(B.charAt(j))) + carry;
                    carry = sum / 2;
                    res = sum % 2;
                    c = res+c;
                }
            for (int i = alen-blen -1 ; i >=0  ; i--) {
                sum = Integer.parseInt(String.valueOf(A.charAt(i))) + carry;
                carry = sum / 2;
                res = sum % 2;
                c = res+c ;
            }
            }
//10  100
        else if (blen > alen) {
            carry=0;
            for (int i = blen - 1 ,  j = alen-1 ;  j>=0 ; i-- , j--) {
                //System.out.println(A.charAt(j));
                //System.out.println(B.charAt(i));
                sum = Integer.parseInt(String.valueOf(A.charAt(j))) + Integer.parseInt(String.valueOf(B.charAt(i))) + carry;
             //   System.out.println(sum);
                carry = sum / 2;
                res = sum % 2;
                c =  res+c;
            }
            for (int i = blen-alen -1 ; i >=0  ; i--) {
                sum = Integer.parseInt(String.valueOf(B.charAt(i))) + carry;
                carry = sum / 2;
                res = sum % 2;
                c =  res+c;
            }
        }*/
