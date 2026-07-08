public class placeTiles {
    public static int tiles(int m, int n){
        if (n<m){
            return 1;
        }
        if (n==m){
            return 2;
        }
        
        //vertical
        //tiles(m,n-m);
        //horizontal
        //tiles(m, n-1);
        return tiles(m, n-1)+tiles(m, n-m);
    }
    public static void main(String[] args) {
        int m = 2;
        int n = 4;//1Xm;
        System.out.println(tiles(m, n));
    }
}
