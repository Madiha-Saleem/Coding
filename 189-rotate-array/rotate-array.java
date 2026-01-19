class Solution {
    public void rotate(int[] nums, int k) {
        int i,l;
        l=nums.length;
        int temp[]=new int[l];
        k=k%l;
        for(i=0;i<l;i++){
            temp[(i+k)%l]=nums[i];
        }
        for(i=0;i<l;i++){
            nums[i]=temp[i];
        }
    }
}