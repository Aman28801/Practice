package Recursion;

//Problem Statement: Given a number of stairs.
// Starting from the 0th stair we need to climb to the “Nth” stair. At a time we can climb either one or two steps.
// We need to return the total number of distinct ways to reach from 0th to Nth stair.
public class ClimbingStairs {
    static int stairs(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println("Number of ways "+ stairs(n));
    }
}
