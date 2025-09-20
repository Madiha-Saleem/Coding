class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i,j,l;
        l=nums.length;
        for(i=0;i<l;i++){
            for(j=i+1;j<=i+k &&j<l ;j++){
                if(nums[i]==nums[j])
                return true;
            }
        }
        return false;
    }
}