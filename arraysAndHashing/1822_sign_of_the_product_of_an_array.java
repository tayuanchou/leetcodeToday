public class Solution{
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { -1, 2, 3, 4 };
        System.out.println(sol.arraySign(nums));
        nums = new int[] { 0, 3, 2, 1 };
        System.out.println(sol.arraySign(nums));
        nums = new int[] { -1, 1, -1, 1, -1 };
        System.out.println(sol.arraySign(nums));
    }
    
    public int arraySign(int[] nums) {
        int len = nums.length;
        int negative_count = 0;
        for (int n : nums) {
            if (n == 0) return 0;
            if (n < 0) negative_count++;
        }
        return negative_count % 2 == 0 ? 1 : -1;
    }
}