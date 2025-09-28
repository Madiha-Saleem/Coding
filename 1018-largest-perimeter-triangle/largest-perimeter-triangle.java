class Solution {
    public int largestPerimeter(int[] nums) {
        int i,sum=0;
        Arrays.sort(nums);
        for(i=nums.length-1;i>=2;i--){
            if(nums[i]<nums[i-1]+nums[i-2]){
                sum=nums[i]+nums[i-1]+nums[i-2];
                return sum;
            }        
        }
        return 0;
    }
}