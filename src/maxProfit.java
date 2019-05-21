public class maxProfit {
    public int solution(int[] prices) {
        int maxProfit=0;
        int min=Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) min = prices[i];
            else {
                //check how much profit if we sell now
                maxProfit = Math.max(maxProfit,prices[i]-min);
            }
        }
        return maxProfit;
        // int profit=0;
        // for (int i = 0; i<prices.length;i++) {
        //     for (int j=i+1; j<prices.length;j++) {
        //         if (prices[j]-prices[i] > profit) profit = prices[j]-prices[i];
        //     }
        // }
        // return profit;
    }

    public static void main(String[] args) {

    }
}
