
public class SieveForPrime {
    public static void main(String[] args) {
        primes(50);
    }
    static void sieve(int n){
        boolean[] array = new boolean[n+1];
        for(int i=2;i*i<=n;i++){
            if(!array[i]){
                for(int j = i*i;j<=n;j+=i){
                    array[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(!array[i]){
                System.out.print(i+" ");
            }
        }
    }
    static void primes(int n){
        for(int i=2;i<n;i++){
            boolean flag = true;
            for(int j=2;j*j<=i;j++){
                    if(i%j==0){
                        flag=false;
                        break;
                    }
                }
            if (flag) { // If flag is still true, i is prime
                    System.out.print(i + " ");
            }  
        }
            
    }
}

