public class Solution {
    public static void main(String[] args) {
        System.out.println(Solution.hammingWeight2(11));
        System.out.println(Solution.hammingWeight2(128));
        System.out.println(Solution.hammingWeight2(2147483645));
        System.out.println(Solution.hammingWeight(257)); //1000001
    }
    
    public static int hammingWeight(int n) {
        // time complexity: O(32) = O(1)
        int ans = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                ans++;
            }
            n = n >> 1;
        }
        return ans;
    }
    
    // clever solution
    public static int hammingWeight2(int n) {
        int ans = 0;
        while (n != 0) {
            n = n & (n-1);
            ans++;
        }
        return ans;
    }
    // think about 100000001
}