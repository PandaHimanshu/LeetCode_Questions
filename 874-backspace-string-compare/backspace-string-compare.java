public class Solution {
    public boolean backspaceCompare(String S, String T) {
        String inputS = backspaceString(S);
        String inputT = backspaceString(T);
        return inputS.equals(inputT);
    }

    private String backspaceString(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                count++;
            } else if (count > 0) {
                count--;
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.reverse().toString();
    }
}
