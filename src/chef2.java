///* package codechef; // don't place package name! */
//
//import java.util.*;
//import java.lang.*;
//import java.io.*;
//
//class Codechef
//{
//    public static void main (String[] args) throws java.lang.Exception
//    {
//        Scanner sc = new Scanner(System.in);
//        int tc = sc.nextInt();
//        for (int j = 0; j < tc; j++) {
//            int x = sc.nextInt();
//            int[] arr = new int[x];
//            for(int i=0;i<arr.length;i++){
//                arr[i] = sc.nextInt();
//            }
//            int[] dp = new int[x];
//            dp[0] = arr[0];
//            for(int i=1;i<dp.length;i++){
//                dp[i] = dp[i-1] + arr[i];
//            }
//            System.out.println(dp[x-2]);
//        }
//    }
//}
