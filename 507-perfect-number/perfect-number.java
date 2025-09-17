class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num<=1)
        return false;
        int i,s=1;
        for(i=2;i*i<=num;i++){
            if(num%i==0){
                s=s+i;
                if(i!=num/i){
                    s+=num/i;
                }
            }
        }
        return s==num;
    }
}