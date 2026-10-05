class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i,j,k=0;
        int arr[]=new int[Math.min(nums1.length,nums2.length)];
        for(i=0;i<nums1.length;i++){
            for(j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]&&nums2[j]!=-1){
                    arr[k]=nums1[i];
                    k++;
                    nums2[j]=-1;
                    break;
                }
            }
        }
        int ans[]=new int[k];
        for(i=0;i<k;i++){
            ans[i]=arr[i];
        }
        return ans;
    }
}