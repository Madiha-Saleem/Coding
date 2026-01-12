class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int arr[]=new int[2];
        int i,idx=0;
        for(i=0;i<nums.length;i+=2){
            if(i==nums.length-1||nums[i]!=nums[i+1]){
                arr[idx++]=nums[i];
                i--;
            }
        }
        return arr;
    }
}