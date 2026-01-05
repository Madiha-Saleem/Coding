class Solution {
    public String reverseWords(String s) {
        int i;
        char ch;
        StringBuilder ch1=new StringBuilder();
        StringBuilder s1 =new StringBuilder();
        for(i=s.length()-1;i>=0;i--){
            ch=s.charAt(i);
            if(ch!=' '){
                ch1.insert(0, ch);  // build word
            }
            else if(ch1.length()>0){
                s1.append(ch1).append(' ');
                ch1.setLength(0);  //clear word
            }
        }
        if(ch1.length()>0)
            s1.append(ch1);
        return s1.toString().trim();
    }
}

/*class Solution {
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
}*/