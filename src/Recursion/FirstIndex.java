package Recursion;

public class FirstIndex {
    public static int firstindex(int[] arr, int si, int data){
        if(si==arr.length){
            return -1;
        }
        if(arr[si]==data){
            return si;
        }
        else{
            return firstindex(arr,si+1,data);
        }
    }
    public static void main(String[] args) {
        int[] arr ={ 3 , 5, 6, 7, 8, 4, 3,};
        System.out.println(firstindex(arr,0,1));
    }
}

