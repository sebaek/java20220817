package p99leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution2089 {
    public List<Integer> targetIndices(int[] nums, int target) {
        int small = 0;
        int big = 0;
        
        for (int num : nums) {
            if (target > num) {
                small++;
            }
            
            if (target < num) {
                big++;
            }
        }
        
        List<Integer> list = new ArrayList<>();
        for (int i = small; i < nums.length - big; i++) {
            list.add(i);
        }
        
        return list;
    }
}
