public class BMconcept {
    public static void main(String[] args) {
    int N=1;
        System.out.println(checkbit(N,0));

        System.out.println("to check how many bits are set in any number ");

        int A=8; int count=0;
        for (int i = 0; i < 32; i++) {
            if(checkbit(A,i)){
                count++;
            }
        }
        System.out.println("ans : in "+A+" we have "+count+" bits is/are sets");
    }


    static boolean checkbit(int N , int i){
        return (N>>i & 1)==1;
    }
}
