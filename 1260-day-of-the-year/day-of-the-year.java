class Solution {
    public int dayOfYear(String date) {
        int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int i,l,day,month,yr,ans=0;
        l=date.length();
        yr=Integer.parseInt(date.substring(0,4));
        month=Integer.parseInt(date.substring(5,7));
        day=Integer.parseInt(date.substring(8,10));
        if(yr%400==0||(yr%4==0 && yr%100!= 0))
            days[1]=29;
        for(i=0;i<month-1;i++){
            ans+=days[i];
        }
        ans += day;
        return ans;
    }
}