public class xPowerN2 {
    public static int xPowerN(int x, int n){
        if (n==0){
            return 1;
        }
        if (n%2==0){
            return xPowerN(x, n/2)*xPowerN(x, n/2);
        }
        else{
            return xPowerN(x, n/2)*xPowerN(x, n/2)*x;
        }
    }
    public static void main(String args[]){
        
        System.out.println(xPowerN(10, 5));
    }
}