class Solution {
    public int largestPerimeter(int[] nums) {
        int i;
        Arrays.sort(nums);
        for(i=nums.length-1;i>=2;i--){
            if(nums[i]<nums[i-1]+nums[i-2]){
                return nums[i]+nums[i-1]+nums[i-2];
            }        
        }
        return 0;
    }
}