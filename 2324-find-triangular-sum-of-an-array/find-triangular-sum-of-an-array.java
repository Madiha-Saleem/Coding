class Solution {
    public int triangularSum(int[] nums) {
        int newNums[]=new int [nums.length-1];
        int len=nums.length;
        while(len>1){
            for(int i=0;i<len-1;i++){
            newNums[i]=(nums[i]+nums[i+1])%10;
            }
            nums=newNums;
            len--;
        }
        return nums[0];
    }
}