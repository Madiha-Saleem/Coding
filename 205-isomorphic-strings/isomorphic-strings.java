class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        return false;
        int i,j;
        char ch,ch1;
        int arr[]=new int[256];
        int arr1[]=new int[256];
        for(i=0;i<s.length();i++){
            ch=s.charAt(i);
            ch1=t.charAt(i);
            if(arr[ch]!=arr1[ch1])
            return false;
            arr[ch]=i+1;
            arr1[ch1]=i+1;
        }
    return true;
    }
}