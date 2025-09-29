class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int i,j=0,len; 
        for(i=1;i<nums.length;i++){
            if(nums[j]!=nums[i]){
                j++;
                nums[j]=nums[i];
            }
        }
        len=j+1;
        if(len>=3)
        return nums[len-3];
        else
        return nums[len-1];
    }
}