public class AddWithBin {
public static void main(String[] args) {
    System.out.println(add(1,100));
}
static int add(int a, int b){
    while(b>0){
        int temp = a&b;
        a=(a^b);
        b= temp<<1;

    }
    return a;
}
}
