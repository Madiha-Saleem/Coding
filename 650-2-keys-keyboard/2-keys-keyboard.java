class Solution {
    public int minSteps(int n) {
        int i,steps=0;
        for(i=2;i<=n;i++){
            while(n%i==0){
                steps+=i;
                n/=i;
            }
        }
        return steps;
    }
}
