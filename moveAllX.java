public class moveAllX {
    public static String moveAllX(String str, int count, int idx, String result){
        if(idx==str.length()){
            for(int i=0; i<count;i++){
                result+='x';
                
            }
            return result;
        }
        if(str.charAt(idx)=='x'){
            count++;
            return moveAllX(str, count, idx+1,result);
            
        }
        else{
            return str.charAt(idx)+ moveAllX(str, count, idx+1, result);
            
        }
    }
    public static void main(String args[]) {
        String str = "abcdefxghxixjxxxk";
        int count = 0;
        String newStr = moveAllX(str, 0, count,"");
        System.out.println(newStr);
        }
}
