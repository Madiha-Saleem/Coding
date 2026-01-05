class Solution {
    public String reverseWords(String s) {
        int i;
        char ch;
        String ch1="",s1="";
        for(i=s.length()-1;i>=0;i--){
            ch=s.charAt(i);
            if(ch!=' ')
            ch1=ch+ch1;
            else if(!ch1.equals("")){
                s1=s1+ch1+" ";
                ch1="";
            }
        }
        if(!ch1.equals(""))
            s1=s1+ch1;
        return s1.trim();
    }
}