class Solution {
    public boolean isSameAfterReversals(int num) {
        int r1,r2;
        r1=reverse(num);
        r2=reverse(r1);
        return num==r2;
    }
    public int reverse(int n){
        int r,s=0;
        while(n!=0){
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        return s;
    }
}