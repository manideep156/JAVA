import java.util.*;
public class Sort {
    public static void main(String[] args){
        int[] arr = {6,5,4,1,2};
        System.out.println(Arrays.toString(selectionSort(arr)));
        
    }
    static int[] selectionSort(int[] arr){
        for (int i=0;i <= arr.length-2;i++){
            int j = i+1;
            while(j>0){
                if (arr[j]<=arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    j--;
                }
                else{
                    break;
                }
            }
        }
        return arr;
    }
}
