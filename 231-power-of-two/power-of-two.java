/*class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)
        return false;
        for(int i=0;i<31;i++){
            if(n==Math.pow(2,i))
            return true;
        }
        return false;
    }
}*/

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)
        return false;
        while(n%2==0)
        n=n/2;
        return n==1;
    }
}