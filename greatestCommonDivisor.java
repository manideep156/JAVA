import java.util.*;
import java.math.*;
public class greatestCommonDivisor {
    public static int gcd(int a, int b){
        int smallest = Math.min(a, b);
        int gcd=1;
        for (int i = 2; i<=smallest;i++){
            if (a%i==0 && b%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD of two numbers = "+gcd(a, b));
    }
}
