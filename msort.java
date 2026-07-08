import java.util.Arrays;

public class msort {
    public static void main(String[] args) {
        int[] array = {5,4,3,2,100};
        System.out.println(Arrays.toString(mergeS(array)));
    }
    static int[] mergeS(int[] array){
        int mid = array.length/2;
        if(array.length==1){
            return array;
        }
        return merge(mergeS(Arrays.copyOfRange(array,0,mid)),mergeS(Arrays.copyOfRange(array,mid,array.length)));
    }
    static int[] merge(int[] a1, int[] a2){
        int[] arr = new int[a1.length+a2.length];
        int i = 0;
        int j=0;
        int k=0;
        while(i<a1.length && j<a2.length){
            if(a1[i]<a2[j]){
                arr[k]=a1[i];
                i++;
                k++;
            }
            else{
                arr[k]=a2[j];
                j++;
                k++;
            }
        }
        while(i<a1.length){
            arr[k]=a1[i];
            i++;
            k++;
        }
        while(j<a2.length){
            arr[k]=a2[j];
            j++;
            k++;
        }
        return arr;

    }
}
