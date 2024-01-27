package DSA;

import java.util.Arrays;

class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int product = 1;
        for (int num : nums) {
            product = product * num;
        }
        for(int i=0;i<n;i++){
            ans[i] = product / nums[i];
        }
        return ans;
    }
}
