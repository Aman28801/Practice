package DSA;

public class MaxSubArray {
    public static int solution(int[] arr){
        int csum=arr[0];
        int osum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(csum>=0){
                csum=csum+arr[i];
            }else{
                csum=arr[i];
            }if(csum>osum){
                osum=csum;
            }
        }
        return osum;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,-2,6,-14,7,-1,4,5,7,-10,2,9,-10,-5,-9,6,1};
        System.out.println(solution(arr));
    }
}
