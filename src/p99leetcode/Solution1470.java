package p99leetcode;

public class Solution1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        
        // your code..
        for (int i = 0; i < n; i++) {
            res[i * 2] = nums[i];
            res[i * 2 + 1] = nums[i + n];
        }
        
//        java.util.Arrays.setAll(res, i -> (i % 2 == 0) ? nums[i / 2] : nums[i / 2 + n]);
        
        return res;
    }
}
