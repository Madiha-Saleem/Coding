class Solution {
    public String convertToTitle(int columnNumber) {
        String ans="";
        while(columnNumber>0){
            int remainder=(columnNumber-1)%26;
            char letter=(char)('A'+remainder);
            ans=letter+ans;
            columnNumber=(columnNumber-1)/26;
        }
        return ans;
    }
}