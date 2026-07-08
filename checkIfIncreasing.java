public class checkIfIncreasing {
    public static boolean checkIfIncreasing(int arr[],int idx){
        if (idx==arr.length-1){
            return true;
        }
        if(arr[idx]>arr[idx+1]){
            return false;
        }
        else{
            return checkIfIncreasing(arr, idx+1);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,2,50};
        System.out.println(checkIfIncreasing(arr, 0));
    }
}
