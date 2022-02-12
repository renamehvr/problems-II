
import java.util.*;
public class commonOf2Array {
    public static void main(String[] args) {
        int[] A = {1,2,2,3,1,6,12,4};
        int[] B= {2,1,2,4,0,8};
        ArrayList<Integer> C=new ArrayList<>();

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i <A.length ; i++) {

            if (map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i])+1);
            }
            else map.put(A[i],1);
        }
        for (int i = 0; i < B.length; i++) {
            if (map.containsKey(B[i])) {
                map.put(A[i], map.get(A[i])-1);
                C.add(B[i]);
            }
        }

        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("common elements are ");
        for (int i = 0; i < C.size() ; i++) {
            System.out.print(C.get(i)+" ");
        }
    }


    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> list=new ArrayList<>();
        int N = A.size();
        int M = B.size();

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i <N ; i++) {
            if (map.containsKey(A.get(i))) {
                map.put( A.get(i) , map.get(A.get(i))+1);
            }
            else map.put(A.get(i),1);
        }

        for (int i = 0; i < M ; i++) {
            if (map.containsKey(B.get(i))){
                if(map.get(B.get(i)) >0 ) {
                    map.put(B.get(i), map.get(B.get(i))-1);
                    list.add(B.get(i));
                }
            }
        }
        return list;
    }
}
