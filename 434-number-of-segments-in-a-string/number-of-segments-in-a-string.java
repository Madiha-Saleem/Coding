class Solution {
    public int countSegments(String s1) {
        int i,count=0;
        boolean inword=false;
        String s=s1.trim();
        if(s.isEmpty()||s.isBlank())
        return 0;
            for(i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                if(!inword){
                    count++;
                    inword=true;
                }
            }
            else
            inword=false;
        }
        return count;
    }
}