class Solution {
    public int removeDuplicates(int[] nums) {
        int val = 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[val]=nums[i+1];
                val++;
            }
        }
        return val;
    }
}