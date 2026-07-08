public class countPathMaze {
    public static int countPaths(int i, int j,int n,int m){
        if (i==m-1||j==n-1){
            return 1;
        }
        
        //downpaths

        int a = countPaths(i+1,j,n, m);
        //rightpaths
        int b = countPaths(i,j+1,n, m);
        return a+b;
    }
    public static void main(String args[]){
        int n =3;
        int m = 4;
        System.out.println(countPaths(0,0,n, m));
    }
}
