public class Solution {
    public int kthGrammar(int n, int k) {
        if (n == 1) {
            return 0;
        }
        int parent = kthGrammar(n - 1, (k + 1) / 2);
        // If k is odd, the element in the parent row is 0.
        if (k % 2 == 1) {
            return parent;
        } else {
            // If k is even, flip the value of the parent element.
            return parent == 0 ? 1 : 0;
        }
    }
}