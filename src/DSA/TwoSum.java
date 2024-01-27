package DSA;

import java.util.HashMap;

public class TwoSum {
    public static String sum(int[] arr, int target){
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int a = arr[i];
            int need = target-a;
            if(map.containsKey(need)){
                return "true";
            }
            map.put(arr[i],i);
        }
        return "false";
    }
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        String ans = sum(arr,target);
        System.out.println(ans);
    }
}
