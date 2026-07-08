import java.util.*;
public class recursion3 {
    public static void sumOfFirstNaturalNumbers(int n, int sum) {
        if (n==0){
            System.out.println(sum);
            return;
        }
        sum+=n;
        sumOfFirstNaturalNumbers(n-1, sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        sc.close();
        
        sumOfFirstNaturalNumbers(n,sum);
    }
}
