class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int l=s.lastIndexOf(" ");
        String s1=s.substring(l+1);
        int length = s1.length();
        return length;
    }
}