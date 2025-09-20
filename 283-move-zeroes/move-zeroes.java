class Solution {
    public void moveZeroes(int[] nums) {
        int i,k=0;
        int []nums1=new int[nums.length];
        for(i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums1[k]=nums[i];
                k++;
            }
        }
        for(i=0;i<nums.length;i++){
            nums[i]=nums1[i];
        }
    }
}