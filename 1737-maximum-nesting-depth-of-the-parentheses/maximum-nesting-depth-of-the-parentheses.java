class Solution {
    public int maxDepth(String s) {
        int curDepth = 0;
        int maxDepth = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                curDepth++;
                maxDepth = Math.max(maxDepth, curDepth);
            } else if (s.charAt(i) == ')') {
                curDepth--;
            }
        }
        
        return maxDepth;
    }
}
