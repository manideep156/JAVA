import java.lang.*;
public class printSubsequences {
    public static void printSubsequence(String str, int idx, StringBuilder sb){
        if (idx==str.length()){
            System.out.println(sb);
            return;
        }
        printSubsequence(str, idx+1, new StringBuilder(sb).append(str.charAt(idx)));
        printSubsequence(str, idx+1, sb);
        
    }
    public static void main(String args[]) {
        String str = "abc";
        StringBuilder sb = new StringBuilder();
        printSubsequence(str, 0, sb);
    }
}
