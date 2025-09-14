class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        /*int i=0,j,a,l;
        for(j=1;j<nums.length;j++){ 
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }*/
        int l=nums.length;
        return nums[l-k];
    }
}