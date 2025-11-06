class Solution {
    public boolean isPalindrome(int x) {
        int r,s=0,a;
        a = x;
        if(x<0)
        return false;
        while(x!=0){
        r=x%10;
        x=x/10;
        s=s*10+r;
        }
        if(s==a)
        return true;
        else
        return false;
    }
}