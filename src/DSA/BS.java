package DSA;

public class BS {
    public static void BSearch(int[] arr ,int k){
        int start = arr[0];
        int end = arr[arr.length-1];
        while(start<=end){
            int mid = ( start + end)/2;
            if(k == arr[mid]){
                System.out.println(mid);
            }if(k > arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        System.out.println("-1");
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,8,9};
        int k = 4 ;
        BSearch(arr ,k);
    }
}
