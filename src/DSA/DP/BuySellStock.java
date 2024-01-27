package DSA.DP;

public class BuySellStock {
    static int maximumProfit(int[] Arr){
        int profit = 0;
        int mini = Arr[0];
        for(int i=1;i<Arr.length;i++){
            int cost = Arr[i]-mini;
            profit = Math.max(cost,profit);
            mini = Math.min(mini,Arr[i]);
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] Arr  ={7,1,5,3,6,4};
        System.out.println(maximumProfit(Arr));
    }
}

