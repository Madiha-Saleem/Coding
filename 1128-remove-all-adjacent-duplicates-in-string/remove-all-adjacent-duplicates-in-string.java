class Solution {
    char[] arr;
    int top=-1,i;
    public String removeDuplicates(String s) {
        arr=new char[s.length()];
        for(i=0;i<s.length();i++){
            if(top==-1){
                push(s.charAt(i));
            }
            else if(top()==s.charAt(i)){
                pop();
            }
            else{
                push(s.charAt(i));
            }
        }
        String ans="";
        for(i=0;i<=top;i++){
            ans=ans+arr[i];
        }
        return ans;
    }
    char top(){
        return arr[top];
    }
    void push(char ch){
        top++;
        arr[top]=ch;
    }
    void pop(){
        top--;
    }
}