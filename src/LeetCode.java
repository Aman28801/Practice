public class LeetCode {
    class Solution {
        public int maxArea(int[] height) {
            int area = 0;
            int maxarea=0;
            for(int i=0;i<height.length;i++){
                for(int j=1;j<height.length;j++){
                    maxarea = Math.max(maxarea,Math.min(height[j],height[i])*(j-i));
                }
            }
            return maxarea;
        }

    }
    public static void main(String[] args) {

    }
}
