import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[] {2, 5, 1, 3, 4, 7};
        int n = 3;
        System.out.println(Arrays.toString(Solution.shuffle(nums, n)));
        int[] nums2 = new int[] {1, 2, 3, 4, 4, 3, 2, 1};
        int n2 = 4;
        System.out.println(Arrays.toString(Solution.shuffle(nums2, n2)));
    }
    
    public static int[] shuffle(int[] nums, int n) {
        // space complexity: O(1)
        // time complexity: O(n)
        for (int i = n-1; i >= 0; i--) {
            nums[i] = nums[i] << 10;
            nums[i] = nums[i] | nums[i+n];
        }
        
        for (int i = n - 1; i >= 0; i--) {
            nums[2*i +1] = nums[i] & 1023;
            nums[2*i] = nums[i] >> 10;
        }
        return nums;
    }
    /**
     *  xxxx | yyyy
     *  since 0 <= nums[i] <= 1000
     *  nums[i] only takes 10 bits
     *  so we can use the first 10 bits to store the original value
     *  and the last 10 bits to store the new value
     *  xyxyxyxy
     */
}