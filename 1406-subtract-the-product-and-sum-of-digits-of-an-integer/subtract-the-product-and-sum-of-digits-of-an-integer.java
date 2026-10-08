class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,mul=1,rev;
        while(n!=0){
            rev=n%10;
            n=n/10;
            sum=sum+rev;
            mul=mul*rev;
        }
        return mul-sum;
    }
}