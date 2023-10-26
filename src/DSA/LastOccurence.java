package DSA;

public class LastOccurence {
    public static int occ(int[] arr ,int k){
        int ans = -1;
        for(int i=arr.length -1 ;i>=0;i--){
            if(arr[i] == k){
                return i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,5,6,7,7};
        int k=4;
        System.out.println(occ(arr,k));
    }
}
