public class charOccurence {
    public static int first = -1;
    public static int last = -1;
    public static void charOccurence(String str, char c, int idx){
        if(idx == str.length()){
            return;
        }
        if (str.charAt(idx)==c){
            if (first==-1){
                first=idx;
            }
            else{
                last=idx;
            }
        }
        charOccurence(str, c, idx+1);
    }
    public static void main(String[] args) {
        String str = "tabcdfghijakkk";
        char el = 'a';
        charOccurence(str, el, 0);
        System.out.println("First occurence : " + first);
        System.out.println("Last occurence : " + last);
    }
}
