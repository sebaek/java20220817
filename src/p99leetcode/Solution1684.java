package p99leetcode;

public class Solution1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        int cnt = 0;
        for (String word : words) {
            if (consistOf(allowed, word)) {
                cnt++;   
            }
        }
        
        return cnt;
    }
    
    private boolean consistOf(String allowed, String word) {
        for (int i = 0; i < word.length(); i++) {
            if (!hasChar(allowed, word.charAt(i))) {
                return false;
            }
        }
        
        return true;
    }
    
    private boolean hasChar(String allowed, char c) {
        for (int i = 0; i < allowed.length(); i++) {
            if (allowed.charAt(i) == c) {
                return true;
            }
        }
        
        return false;
    }
}