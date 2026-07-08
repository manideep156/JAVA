import java.lang.*;
import java.util.*;
public class printUniqueSubsequences {
    public static void printUniqueSubsequence(String str, int idx, String newString, HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
            
        }
        printUniqueSubsequence(str, idx+1, newString+str.charAt(idx), set);
        printUniqueSubsequence(str, idx+1, newString, set);


    }
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String str = "aaa";
        printUniqueSubsequence(str, 0, "", set);

    }
}
