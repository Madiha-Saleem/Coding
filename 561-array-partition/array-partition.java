class Solution {
    public int arrayPairSum(int[] nums) {
         Arrays.sort(nums);
        int i,sum=0;
        for (i=0;i<nums.length;i+= 2){
            sum+=nums[i];
        }
        return sum;
    }
}