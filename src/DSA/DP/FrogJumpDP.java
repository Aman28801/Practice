package DSA.DP;

import java.util.Arrays;

//Problem Statement:
//
//Given a number of stairs and a frog, the frog wants to climb from the 0th stair to the (N-1)th stair.
// At a time the frog can climb either one or two steps. A height[N] array is also given.
// Whenever the frog jumps from a stair i to stair j, the energy consumed in the jump is abs(height[i]- height[j]),
// where abs() means the absolute difference.
// We need to return the minimum energy that can be used by the frog to jump from stair 0 to stair N-1.
public class FrogJumpDP {
    static int solve(int[] heights,int[] dp){
        dp[0] = 0;
        int n = heights.length;
        for(int i=1;i<n;i++){
            int ss = Integer.MAX_VALUE;
            int fs = dp[i-1] + Math.abs(heights[i] - heights[i-1]);
            if(i>1){
                ss = dp[i-2]+ Math.abs(heights[i] - heights[i-2]);
            }
            dp[i] = Math.min(fs,ss);
        }
        return dp[n-1];
    }
    public static void main(String[] args) {
        int[] heights = {30,10,60,10,60,50};
        int n = heights.length;
        int[] dp = new int[n];
        Arrays.fill(dp,0);
        System.out.println(solve(heights,dp));
    }
}
