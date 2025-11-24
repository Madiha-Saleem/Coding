class Solution {
    public int dominantIndex(int[] nums) {
        if (nums.length==1) return 0;
        int i,max=-1,second=-1,maxIndex=-1;
        for(i=0;i<nums.length;i++){
            if(nums[i]>max){
                second=max;
                max=nums[i];
                maxIndex=i;
            } else if(nums[i]>second){
                second=nums[i];
            }
        }
        if(max>=2*second) return maxIndex;
        return -1;
    }
}