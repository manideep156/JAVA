import java.util.*;
public class CyclicSort {
    public static void main(String[] args){

        int[] array = {6,5,4,1,0,2,3};
        
        System.out.println(Arrays.toString(cyclicSort0(array)));
    }
    static int[] cyclicSort1(int[] array){
        int i = 0;
        while(i<array.length ){
            int value = i+1;
            if(array[i]!=value){
                int temp = array[array[i]-1];
                array[array[i]-1] = array[i];
                array[i] = temp;
            }
            else{
                i++;
            }
            
        }
        return array;
    }
    static int[] cyclicSort0(int[] array){
        int i = 0;
        while(i<array.length ){
            int value = i;
            if(array[i]!=value){
                int temp = array[array[i]];
                array[array[i]] = array[i];
                array[i] = temp;
            }
            else{
                i++;
            }
            
        }
        return array;
    }
}
