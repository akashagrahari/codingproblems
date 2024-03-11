package slidingwindow;

/**
 * Keep moving left side of window when you encounter dip in price
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 */
public class BestTime {
    public static void main(String[] args) {
        BestTime bestTime = new BestTime();
        int[] arr = {1,2};
        System.out.println(bestTime.maxProfit(arr));
    }

    public int maxProfit(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }
        int l = 0;
        int r = 1;
        int max = 0;

        while(l < r && r < prices.length) {
            max = Math.max(max, prices[r] - prices[l]);
            if (prices[r] < prices[l]) {
                l = r;
            }
            r++;
        }
        return max;
    }

    public int maxProfitTemp(int[] prices) {
        int max = 0;
        int l = 0;
        int r = 1;
        int profit = 0;

        while(l<r && l<prices.length && r<prices.length) {
            profit = prices[r] - prices[l];
            if (profit > max) {
                max = profit;
            }

            if(profit < 0) {
                l = r;
                r = l + 1;
            } else {
                r++;
            }

        }
        return max;
    }
}
