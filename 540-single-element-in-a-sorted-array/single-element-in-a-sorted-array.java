class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i;
        for(i=0;i<nums.length-2;i+=2){
            if(nums[i]!=nums[i+1])
            return nums[i];
        }
        return nums[i];
    }
}