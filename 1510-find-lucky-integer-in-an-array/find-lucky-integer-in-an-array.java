class Solution {
    public int findLucky(int[] arr) {
        int i,j,c=0,max=-1;
        for(i=0;i<arr.length;i++){
            c=0;
            for(j=0;j<arr.length;j++){
                if(arr[i]==arr[j])
                c++;
            }
                if(c==arr[i])
                max=Math.max(max,arr[i]);
        }
        return max;
    }
}