import java.util.*;
public class sumofodds{
    public static int sumofodd(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            if (i%2!=0){
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("The sum of odd numbers upto n = "+ sumofodd(n));
    }
}
