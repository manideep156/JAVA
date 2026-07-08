import java.util.*;
public class perimeter{
    public static double circumference(int r){
       double circumference= (2*3.14*r);
       return circumference;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r= sc.nextInt();
        System.out.println("The circumference is: "+ circumference(r));}}