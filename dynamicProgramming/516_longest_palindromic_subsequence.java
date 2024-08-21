import java.util.*;
public class Solution{
    public static void main(String[] args) {
        int testcase1 = Solution.longestPalindromeSubseq("bbbab");
        System.out.println(testcase1);
        int testcase2 = Solution.longestPalindromeSubseq("cbbd");
        System.out.println(testcase2);
    }
    
    public static int[][] cache;
    public static int longestPalindromeSubseq(String s) {
        if (s == null || s.length() == 0) return 0;
        int n = s.length();
        int ans = 0;
        cache = new int[n][n];
        for (int[] arr : cache) Arrays.fill(arr, -1);
        for (int i = 0; i < n; i++) {
            // odd length and even length    
            ans = Math.max(ans, Math.max(dfs(s, i, i), dfs(s, i, i+1)));
        }
        return ans;
    }
    
    public static int dfs(String s, int i, int j) {
        if (i < 0 || j >= s.length()) return 0;
        
        if (s.charAt(i) == s.charAt(j)) {
            int length = i == j ? 1 : 2;
            cache[i][j] = length + dfs(s, i-1, j+1);
        } else {
            cache[i][j] = Math.max(dfs(s, i-1, j), dfs(s, i, j+1));
        }
        return cache[i][j];
    }
    
    // a similar approach 1143_longest_common_subsequence.java
    
    /**
     * public static int longestPalindromeSubseq(String s) {
     *   if (s == null || s.length() == 0) return 0;    
     *   int n = s.length();
     *   StringBuilder sb = new StringBuilder(s);
     *   String reversed = sb.reverse().toString();
     *   int[][] dp = new int[n+1][n+1];
     *   for (int i = n-1; i >= 0; i--) {
     *      for (int j = n-1; j >= 0; j--) {
     *          if (s.charAt(i) == reversed.charAt(j)) {
     *              dp[i][j] = 1 + dp[i+1][j+1];
     *          } else {
     *              dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);    
     *          }
     *      }
     *   }
     *   return dp[0][0];
     *   
     * 
     * 
     * 
     * 
     * }
     * 
     * 
     * 
     * 
     * */
}