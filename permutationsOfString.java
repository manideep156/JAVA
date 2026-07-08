public class permutationsOfString {
    public static void permutations(String str, int idx, String permuString){
        if (str.length()==0){
            System.out.println(permuString);
            return;
        }
        for (int i =0; i<str.length();i++){
            String newString = str.substring(0, i)+str.substring(i+1);
            permutations(newString, idx+1, permuString+str.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        permutations(str, 0, "");
    }
}
