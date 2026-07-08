import java.lang.*;
public class removeDuplicates {
    public static boolean[] arr = new boolean[26];
    public static StringBuilder removeDuplicates(String str, int idx, StringBuilder sb){
        if (idx==str.length()){
            return sb;
        }
        if (arr[str.charAt(idx)-'a']){
            return removeDuplicates(str, idx+1, sb);
        }
        else{
            sb.append(str.charAt(idx));
            arr[str.charAt(idx)-'a']=true;
            return removeDuplicates(str, idx+1, sb);
        }
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str = "abcadbcefghabi";
        System.out.println(removeDuplicates(str, 0, sb));
    }
}
