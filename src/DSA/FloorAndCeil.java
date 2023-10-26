package DSA;

import java.util.Arrays;

public class FloorAndCeil {
    public static int floor(int[] arr , int k){
        int low =0;
        int high = arr.length - 1;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] <= k ){
                ans = arr[mid];
                low =mid+1;
            }else{
                high = mid -1;
            }
        }
        return ans;
    }
    public static int ceil(int[] arr , int k){
        int low =0;
        int high = arr.length - 1;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] > k ){
                ans = arr[mid];
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static int[] floorceil(int[] arr , int k){
        int f = floor(arr,k);
        int c = ceil(arr,k);
        return new int[] {f,c};

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8};
        int k = 5;
        int n = 7;
        int[] ans = floorceil(arr,k);
        System.out.println(Arrays.toString(ans));
    }
}
