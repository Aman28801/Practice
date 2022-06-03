package Recursion;

public class IsSorted {
    public static boolean issorted (int[] arr,int si){
        if(si==arr.length){
            return true;
        }
        if(arr[si]>arr[si+1]){
            return false;
        }
        else{
            return issorted(arr ,si+1);
        }

    }
    public static void main(String[] args) {
        int[] arr = {2,5,7,4,7,3,6};
        System.out.println(issorted(arr,0));
    }
}
