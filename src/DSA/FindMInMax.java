package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class FindMInMax {

    public static int findmin(int[] arr){
        sort(arr);
        return arr[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Minimun " + findmin(arr));
        System.out.println("Maximun " + findmax(arr));
    }

    private static int findmax(int[] arr) {
        sort(arr);
        return arr[arr.length-1];
    }
    //with sorting function or use Arrays.sort(arr);
    public static void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp;
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}




