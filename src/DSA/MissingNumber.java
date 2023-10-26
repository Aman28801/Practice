package DSA;

public class MissingNumber {
    public static int misssing(int[] arr){
        int n = arr.length;
        int s1 =(n*(n+1))/2;
        int s2 = 0;
        for(int i=0 ; i< n-1; i++){
            s2 = s2 + arr[i];
        }
        return s1 - s2;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7}; //4
        System.out.println(misssing(arr));
    }
}
