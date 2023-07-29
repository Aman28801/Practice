package DSA;

public class ReverseArray {
    static void reverse(int arr[],int start, int end)
    {
        int temp;
        while (start <= end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        int n= arr.length - 1;
        reverse(arr,0,n);
        print(arr);
    }
}
