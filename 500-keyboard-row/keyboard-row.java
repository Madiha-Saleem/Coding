class Solution {
    public String[] findWords(String[] words) {
        String r1="qwertyuiop";
        String r2="asdfghjkl";
        String r3="zxcvbnm";
        String temp[]=new String[words.length];
        int i,count=0;
        for (String word:words){
            String w=word.toLowerCase(); 
            String row="";
            if(r1.contains(""+w.charAt(0)))
                row=r1;
            else if(r2.contains(""+w.charAt(0)))
                row=r2;
            else
                row=r3;
            boolean valid=true;
            for (i=0;i<w.length();i++){
                if(!row.contains(""+w.charAt(i))){
                    valid=false;
                    break;
                }
            }
            if(valid)
                temp[count++]=word;
        }
        String[] result=new String[count];
        for (i=0;i<count;i++)
            result[i]=temp[i];
        return result;
    }
}