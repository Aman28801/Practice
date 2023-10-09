package DSA;

public class LS {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,9};
        int k = 5;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==k) {
                System.out.println(i);
            }
        }
        System.out.println("-1");
    }
}
