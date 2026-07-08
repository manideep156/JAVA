import java.util.*;
public class power {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int product = 1;
        for (int i=0;i<n;i++){
            product*=x;
        }
        System.out.println("Power of x to n = "+product);
    }
}
