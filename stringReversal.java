public class stringReversal {
    public static String stringReversal(String str){
        if (str.length()==1){
            return str;
        }
        char currChar = str.charAt(0);
        String nextString = stringReversal(str.substring(1));
        return nextString + currChar;
        
    }
    public static void main(String args[]){
        String str = "abcd";
        System.out.println(stringReversal(str));
    }
}
