class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int temp=x;
            while(x>0){
                int digit=x%10;
                rev=(rev*10)+digit;
                x=x/10;
        }
        if(rev==temp){
            return true;
        }
        return false;
    }
}