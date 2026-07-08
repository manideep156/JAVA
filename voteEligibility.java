import java.util.*;
public class voteEligibility {
    public static String Eligibility(int age){
        if (age>=18){
            return "Yes";
        }
        else{
            return "No";
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age= sc.nextInt();
        System.out.println("Eligibility : "+Eligibility(age));
        sc.close();
    }
}
