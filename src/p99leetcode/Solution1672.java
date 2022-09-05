package p99leetcode;

public class Solution1672 {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        
        for (int[] row : accounts) {
            int sum = 0;
            for (int val : row) {
                sum += val;
            }
            
            max = Math.max(max, sum);
        }
        
        return max;
    }
}