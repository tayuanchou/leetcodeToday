import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int testcase1 = Solution.longestCommonSubsequence("abcde", "ace");
        System.out.println(testcase1);
        int testcase2 = Solution.longestCommonSubsequence("abc", "abc");
        System.out.println(testcase2);
        int testcase3 = Solution.longestCommonSubsequence("abc", "def");
        System.out.println(testcase3);
    }
    
    public static int longestCommonSubsequence(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() == 0 || s2.length() == 0) return 0;
        int m = s1.length(), n = s2.length();
        int[][] dp = new int[m+1][n+1];
        for (int i = 0; i < m+1; i++) dp[i][n] = 0;
        for (int j = 0; j < n+1; j++) dp[m][j] = 0;
        for (int i = m-1; i >= 0; i--) {
            for (int j = n-1; j >= 0; j--) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    dp[i][j] = 1 + dp[i+1][j+1];
                } else {
                    dp[i][j] = Math.max(dp[i][j+1], dp[i+1][j]);
                }
            }
        }
        return dp[0][0];
    }
}