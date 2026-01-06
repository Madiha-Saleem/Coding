class Solution {
    public int findLucky(int[] arr) {
        int freq[]=new int[501];
        int i;
        for(int num:arr){
            freq[num]++;
        }
        for(i=500;i>=1;i--){
            if(freq[i]==i){
                return i;
            }
        }
        return -1;
    }
}

/*class Solution {
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
}*/