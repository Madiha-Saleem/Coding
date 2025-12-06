class Solution {
    public String convertToBase7(int num) {
        return Integer.toString(num,7);
    }
}

/*int r;
        String s="";
        if(num==0) return "0"; 
        boolean isNeg=num<0;
        num=Math.abs(num);
        while(num!=0){
            r=num%7;
            num=num/7;
            s=r+s;
        }
         if(isNeg) s="-"+s;
        return s;*/