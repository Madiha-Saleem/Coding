class Solution {
    public int missingNumber(int[] nums) {
        int i,sum=0,sum1=0;
        for(i=0;i<nums.length;i++){
            sum=sum+i+1;
            sum1=sum1+nums[i];
        }
        return sum-sum1;
    }
}