class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i+=3){
            if (i+2>=nums.length||nums[i]!=nums[i+1]||nums[i]!=nums[i+2])
            return nums[i];
        }
        return nums[nums.length-1];
    }
}