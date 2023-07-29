package DSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ContainDuplicate { // true id it contains dublicate else false

    public static boolean cheak(int[] arr) {
        HashSet<Integer> hm = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.contains(arr[i])) {
                return true;
            } else {
                hm.add(arr[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(cheak(arr));
    }
}
//        int[] arr = {1,2,3,4,2};
//        Arrays.sort(arr);
//        for(int i=0;i<arr.length-1;i++){
//                if(arr[i]==arr[i+1]){
//                    System.out.println("True");
//            }
//        }
