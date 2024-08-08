class Solution {
    public String reverseWords(String s) {
        // Trim the string to remove leading and trailing spaces
        s = s.trim();
        
        // Split the string by one or more spaces
        String[] words = s.split("\\s+");
        
        // Use two pointers to reverse the words in-place
        int left = 0, right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        
        // Join the reversed words with a single space
        return String.join(" ", words);
    }
}
