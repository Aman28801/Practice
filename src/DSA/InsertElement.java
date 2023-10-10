package DSA;

public class InsertElement {
    public static int check(int[] arr, int k){
        int start = 0;
        int end = arr.length-1;
        int ans = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]>=k){
                ans = mid;
                end = mid-1;
            }else{
                start = mid +1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8};
        int k = 5;
        System.out.println(check(arr,k));;
    }
}
