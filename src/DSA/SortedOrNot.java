package DSA;

public class SortedOrNot {

    public static boolean isSorted(int[] arr,int i,int j){
        if(i>=j){
            return false;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        else{
            isSorted(arr,i+1,j);
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8,7};
        System.out.println(isSorted(arr,0,arr.length-2));
    }
}
