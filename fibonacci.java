import java.util.*;
public class fibonacci {
    public static void fib(int a,int b, int n){
        if (n==0){
            return;
        }
        System.out.print(a+" ");
        fib(b,a+b,n-1);
    }
    public static void main(String args[]){
        int a = 0;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        fib(a, b, n);
    }
}
