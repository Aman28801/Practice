package Recursion;

import java.util.Arrays;

public class ArrayReverse {
    public static void reverse(int[] arr, int l,int r){
        if(l>=r){
            return;
        }
        else{
            swap(arr,l,r);
            reverse(arr,l+1,r-1);
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,4,2};
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
