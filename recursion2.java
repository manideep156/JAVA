import java.util.*;

public class recursion2 {
    public static void printNumbers(int n, int a) {
        if (n > a) {
            return;
        }
        System.out.print(n + " ");
        printNumbers(n + 1, a);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        sc.close();
        
        printNumbers(1, a);
    }
}
