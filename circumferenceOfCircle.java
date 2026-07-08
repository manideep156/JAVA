import java.util.*;
public class circumferenceOfCircle {
    public static int circumference(int radius){
        return (2*22*radius)/7;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Circumference of Circle : "+circumference(r));
        sc.close();
    }
}
