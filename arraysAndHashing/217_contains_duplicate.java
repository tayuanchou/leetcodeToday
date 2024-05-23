import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3, 1};
        System.out.println(sol.containsDuplicate(nums));
        int[] nums2 = {1, 2, 3, 4};
        System.out.println(sol.containsDuplicate(nums2));
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(sol.containsDuplicate(nums3));
    }
    
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }
}