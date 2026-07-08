import java.util.*;
public class average{
    public static float ThreeNumsAverage(int a,int b , int c){
        return (a+b+c)/3;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The average of three variables =  "+ThreeNumsAverage(a,b,c));
        }
    }
    

