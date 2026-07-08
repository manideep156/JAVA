import java.util.Arrays;

public class ssort {
    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};
        System.out.println(Arrays.toString(selectionSort(array)));
    }
    static int[] selectionSort(int[] array){
        for(int i=0;i<array.length-1;i++){
            int min = i;
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    min = j;
                }
                if(min!=i){
                    int temp = array[j];
                    array[min] = array[i];
                    array[i] = temp;
                }
            }
        }

        return array;
    }
}
