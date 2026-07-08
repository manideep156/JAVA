import java.util.*;
public class subsetsOfSet {
    public static void subsets(int n ,ArrayList<Integer> subset){
        subsets(n-1, subset);
        subset.add(n);
        subsets(n-1, subset);
        subset.remove(subset.size()-1);
    }
    public static void main(String[] args) {
        int n =3;
        ArrayList <Integer> subset = new ArrayList<Integer>();
        subsets(n, subset);
    }
}
