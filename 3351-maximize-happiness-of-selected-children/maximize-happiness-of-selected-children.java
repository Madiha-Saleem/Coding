class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long sum=0;
        int i,value;
        int l=happiness.length;
        for(i=0;i<k;i++){
            value=happiness[l-1-i]-i;
            if(value<=0)
            break;
            sum+=value;
        }
        return sum;
    }
}