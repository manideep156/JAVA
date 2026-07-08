import java.util.*;
public class Fibonacci1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a=0;
        int b = 1;
        while(n!=0){
            System.out.println(a);
            int temp = b;
            b=a+b;
            a=temp;
            n--;
            
        }
    }
}
