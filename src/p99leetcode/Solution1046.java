package p99leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution1046 {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for (int stone : stones) {
            list.add(stone);
        }
        
        // 하나 남을 때 까지
        while (list.size() > 1) {
            // 정렬해서
            list.sort(Comparator.naturalOrder());
            // 맨 뒤 두개 꺼내서
            Integer big1 = list.remove(list.size() - 1);
            Integer big2 = list.remove(list.size() - 1);
            // 부딪히고
            Integer diff = big1 - big2;
            
            // 남은 거 다시 추가    
            if (diff != 0) {
                list.add(diff);
            }
        }
        
        if (list.isEmpty()) {
            return 0;
        } else {
            return list.get(0);
        }
    }
}




