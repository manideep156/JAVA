public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(root1(30));
    }
    static int root(int n){
        int i=1;
        for(i=1;i<n;i++){
            if(i*i==n){
                return i;
            }
            else if(i*i>n){
                return i-1;
            }
        }
        return -1;
    }
    static int root1(int n){
        int l=0;
        int r=n;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(mid*mid==n){
                return mid;
            }
            else if(mid*mid>n){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return r;
    }
}
