package p99leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution771 {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }
        
        int cnt = 0;
        for (int i = 0; i < stones.length(); i++) {
            if(set.contains(stones.charAt(i))) {
                cnt++;
            }
        }
        
        return cnt;
    }
}


