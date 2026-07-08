import java.util.*;
public class greatest{
    public static int greaterAmongTwo(int a, int b){
        
        if (a>b)
            return a;
        else{
            return b;
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("The greatest among two is : "+ greaterAmongTwo(a,b));}}