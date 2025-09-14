class Solution {
    public int majorityElement(int[] nums) {
        int count=0,current=0;
        for (int num : nums){
            if (count==0){
                current=num;
            }
            count += (num == current) ? 1 : -1;
        }
        return current;
        }
    }