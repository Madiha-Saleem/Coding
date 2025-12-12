class Solution {
    public int findNumbers(int[] nums) {
        int c=0,count;
        for(int number:nums){
            count=countDigits(number);
            if(count%2==0)
            c++;
        }
        return c;
    }
    public static int countDigits(int num) {
        /*String numString = String.valueOf(Math.abs(num));
        return numString.length();*/
        int r=0;
        while(num>0){
            r++;
            num=num/10;
        }
        return r;
    }
}