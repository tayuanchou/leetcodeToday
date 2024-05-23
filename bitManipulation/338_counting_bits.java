import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.countBits(2)));
        System.out.println(Arrays.toString(Solution.countBits(5)));
        Solution.dp(5);
        System.out.println(Arrays.toString(arr));
    }
    
    public static int[] countBits(int n) {
        int[] ans = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            ans[i] = hammingWeight2(i);
        }
        return ans;
    }
    
    // see 191_number_of_one_bits.java for explanation
    public static int hammingWeight2(int n) {
        int ans = 0;
        while (n != 0) {
            n = n & (n - 1);
            ans++;
        }
        return ans;
    }
    
    // using dynamic programming
    public static int[] arr;
    public static int[] dp(int n) {
        if (n == 0) {
            return new int[]{0};
        }
        arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        int pos = 0;
        for (int i = 2; i <= n; i++) {
            // to see if i is power of 2
            if ((i & (i-1)) == 0) {
                arr[i] = 1;
                pos = 1;
            } else {
                arr[i] = 1 + arr[pos++];
            }
        }
        return arr;
    }
    
    /**
     * 0: 0000
     * 1: 0001
     * 2: 0010
     * 3: 0011
     * 4: 0100 1 + dp[0]
     * 5: 0101 1 + dp[1]
     * 6: 0110 1 + dp[2]
     * 7: 0111 1 + dp[3]
     * 8: 1000 1 + dp[0]
     */
}