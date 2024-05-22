public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {2, 2, 1};
        System.out.println(Solution.singleNumber(nums1));
        int[] nums2 = {4, -1, 2, -1, 2, 0, 0};
        System.out.println(Solution.singleNumber(nums2));
    }
    
    public static int singleNumber(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }
}