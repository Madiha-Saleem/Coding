class Solution {
    public int maximumProduct(int[] nums) {
        int p1=1,p2=1,n,max=Integer.MIN_VALUE;
        Arrays.sort(nums);
        n=nums.length;
        p1=nums[n-1]*nums[n-2]*nums[n-3]; //three la
        p2=nums[0]*nums[1]*nums[n-1];
        return Math.max(p1,p2);
    }
}