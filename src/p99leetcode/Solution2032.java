package p99leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution2032 {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        
        for (int num : nums1) {
            set1.add(num);
        }
        
        for (int num : nums2) {
            set2.add(num);
        }
        
        for (int num : nums3) {
            set3.add(num);
        }
        
        Set<Integer> all = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        
        for (Integer num : set1) {
            all.add(num);
        }
        
        for (Integer num : set2) {
            if (!all.add(num)) {
                res.add(num);
            }
        }
        
        for (Integer num : set3) {
            if (!all.add(num)) {
                res.add(num);
            }
        }
        
        return new ArrayList<Integer>(res);
    }
}




