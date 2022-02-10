import java.util.ArrayList;
import java.util.HashMap;

//   10, 5, 3, 4, 3, 5, 6   ans =5  index based not first number to repeat itself


public class firstRepeatingEle {

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
     //   10, 5, 3, 4, 3, 5, 6   ans =5  index based not first number to repeat itself
        A.add(10);
        A.add(5);A.add(3);A.add(4);A.add(3);A.add(5);A.add(6);
       int ans =  solve(A);
        System.out.println(ans);
    }

    public static int solve(ArrayList<Integer> A) {
        int N = A.size();
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i <N ; i++) {
            if (map.containsKey(A.get(i)))  map.put(A.get(i), map.get(A.get(i)) + 1);
            else map.put(A.get(i),1);
        }

        for (int i = 0; i <N ; i++) {
            if(map.get(A.get(i)) >1) return A.get(i);
        }

        return -1;
    }
}
