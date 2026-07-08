import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {5,4,150,3,11,25,2,1};
        int[] ans = mergeSort(array);
        System.out.println(Arrays.toString(ans));
    }
    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] l = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] r = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(l,r);
    }
    static int[] merge(int[] left, int[] right){
        int[] array = new int[left.length+right.length];
        int i=0;
        int j =0;
        int k=0;
        while (i<left.length && j<right.length){
            if(left[i]<=right[j]){
                array[k]=left[i];
                i++;
            }
            else{
                array[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            array[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            array[k]=right[j];
            j++;
            k++;
        }
        return array;
    }
}
