class Solution {
    public boolean isHappy(int n) {
        int r,temp,sum=0;
        temp=n;
        while(n>9){
            sum=0;
            temp=n;
            while(temp>0){
            r=temp%10;
            sum=sum + r*r; 
            temp=temp/10;
        }
        n=sum;
        }
        return n==1||n==7;
    }
}