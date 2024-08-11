class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        
        // Check if the number is a power of 2
        if ((n & (n - 1)) != 0) {
            return false;
        }
        
        // Check if the power of 2 is at an even position and not equal to 1
        return (n & 0x55555555) != 0;
    }
}
