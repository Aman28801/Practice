package DSA;

import java.util.Arrays;

public class ZerosToEnd {

    public static void end(int[] arr ,int n){
        int j = 0;
        for(int i = 0;i<n;i++){
            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
        }
        while(j<n){
            arr[j] =0;
            j++;
        }

    }
    public static void main(String[] args) {
        int[] arr ={1,0,5,8,0,4,7,0,0,9};
        int n = 10;
        end(arr,n);
        System.out.println(Arrays.toString(arr));
    }
}
