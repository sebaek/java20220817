package p99leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution2206 {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            map.compute(num, (k, v) -> map.containsKey(k) ? v + 1 : 1);
        }
        
        java.util.Collection<Integer> values = map.values();
        
        for (Integer value : values) {
            if (value % 2 == 1) {
                return false;
            }
        }
        
        return true;
    }
}




