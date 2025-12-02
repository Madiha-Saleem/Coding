class Solution {
    public void reverseString(char[] s) {
        int left=0,right=s.length-1;
        char temp;
        while(left<right){
            temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }
}

/*int i,j=0;
        char ch[]=new char[s.length];
        for(i=s.length-1;i>=0;i--){
            ch[j]=s[i];
            j++;
        }
        System.out.print("[");
        for(j=0;j<ch.length;j++){
            System.out.print("'"+ch[j]+"'"+",");
        }
        System.out.println("]");*/