package Recursion;

import java.util.Arrays;

public class BubbleSort {
    //Bubble Sort with recursion
    public static void sort(int[]arr,int si,int li){
        if(li==0){
            return;
        }
        if(si==li){
            sort(arr,0,li-1);
            return;
        }
        if(arr[si]>arr[si+1]){
            int temp =arr[si];
            arr[si]=arr[si+1];
            arr[si+1]= temp;
        }
        sort(arr,si+1,li);
    }
//    public static void display(int arr[]){
//        for(int i = 0; i<arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }

    public static void main(String[] args) {
        int[] arr={41,70,74,33,13};
        sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
