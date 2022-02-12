/*
Given a string A consisting of lowercase characters.
Check if characters of the given string can be rearranged to form a palindrome.
Return 1 if it is possible to rearrange the characters of the string A such that it becomes a palindrome else return 0.

input - A = "abcde"
Output 1:   0

A = "abbaee"  Output:1
 */

import java.util.HashMap;
import java.util.Map;

public class CheckPalindromeII {
    public static void main(String[] args) {
        String A= "aaa"  ;     //   "abbaee"  "abcde"
        int count=0;           //counting element with 1,3,5 occurrence
        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < A.length() ; i++) {
            if(map.containsKey(A.charAt(i))){
                map.put(A.charAt(i) , map.get(A.charAt(i))+1);
            }
            else map.put(A.charAt(i),1);
        }
        if(map.size()==1) System.out.println("yes Palindrome is possible");
        for(Map.Entry m : map.entrySet()){
            if(((int)m.getValue()%2!=0 )){
                if(count < 2)  count++;
                else {
                    System.out.println("palindrome is not possible");
                    break;
                }
            }
        }
        System.out.println("yes Palindrome is possible");
        }
    }

