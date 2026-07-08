import java.util.*;
public class Merge {
    public static void main(String[] args) {
        int[] array = {42, 17, 89, 3, 56, 12, 74, 25, 68, 9};
        int[] ans = merge(array);
        System.out.println(Arrays.toString(ans));
    }
    static int[] merge(int[] array){
        if(array.length==1){
            return array;
        }
        
        int mid = array.length/2;
        return merge2(merge(Arrays.copyOfRange(array, 0,mid)),merge(Arrays.copyOfRange(array, mid, array.length)));
    }
    static int[] merge2(int[] arr1, int[] arr2){
        int l=0;
        int r = 0;
        int k = 0;
        int[] array = new int[arr1.length+arr2.length];
        while(l<arr1.length && r<arr2.length){
            if(arr1[l]<=arr2[r]){
                array[k] = arr1[l];
                l++;
                k++;
            }
            else{
                array[k]=arr2[r];
                r++;
                k++;
            }
        }
        while(l<arr1.length){
            array[k] = arr1[l];
            l++;
            k++;
        }
        while(r<arr2.length){
            array[k]=arr2[r];
            r++;
            k++;
        }
        return array;
    }

}

