import java.util.*;
public class factorial {
    public static int fact(int n, int factorial){
        if (n==0||n==1){
            return factorial;
        }
        return factorial = n*fact(n-1, factorial);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans=fact(n, 1);
        System.out.println(ans);
    }
}
