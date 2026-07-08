import java.util.*;

public class greatestofTwo {
    public static int greatest(int a ,int b){
        if (a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Grestest of two : "+greatest(a, b));
        sc.close();
    }
}
