class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i,c=0,max=0,l;
        l=nums.length;
        for(i=0;i<l;i++)
        {
            if(nums[i]==1){
                c++;
            if(c>max)
            max=c;
            }
            else
            c=0;
        }
        return max;
    }
}