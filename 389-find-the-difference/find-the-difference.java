class Solution {
    public char findTheDifference(String s, String t) {
        int i,j,l1,l2,s1=0,s2=0,ans;
        l1=s.length();
        l2=t.length();
        char c1[]=new char[l1];
        char c2[]=new char[l2];
        for(i=0;i<l1;i++){
            c1[i]=s.charAt(i);
            s1=s1+(int)c1[i];
        }
        for(i=0;i<l2;i++){
            c2[i]=t.charAt(i);
            s2=s2+(int)c2[i];
        }
        ans=s2-s1;
        return (char)ans;
        /*char ans=0;
        for(int i=0;i<s.length();i++){
            ans^=s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            ans^=t.charAt(i);
        }

        return ans;*/
    }
}