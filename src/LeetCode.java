public class LeetCode {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int low=0;
        int target=7;
        int high=arr.length-1;
        while(low<=high){
            if(arr[low]+arr[high]==target){
                break;
            }
            if(arr[low]+arr[high]>target){
                high--;
            }
            else{
                low--;
            }
        }
        System.out.println(low+1);
        System.out.println(high+1);
    }
}
