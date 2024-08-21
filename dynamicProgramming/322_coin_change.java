import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int testcase1 = sol.coinChange(new int[]{1, 2, 5}, 11);
        System.out.println(testcase1);
        int testcase2 = sol.coinChange(new int[]{2}, 3);
        System.out.println(testcase2);
    
    }
    
    public int coinChange(int[] coins, int amount) {
        // time compexity: O(c*amonut) where c is the number of coins
        // space complexity: O(amount)
        if (coins == null || coins.length == 0) return -1;
        int[] dp = new int[amount+1];
        Arrays.fill(dp, amount+1);
        Arrays.sort(coins);
        dp[0] = 0;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i], 1+dp[i-coin]);
            }
        }
        return dp[amount] == amount+1? -1 : dp[amount];
    }
}