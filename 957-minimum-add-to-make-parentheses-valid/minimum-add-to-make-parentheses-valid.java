class Solution {
    int i,top=-1,count=0;;
        char arr[];
    public int minAddToMakeValid(String s) {
        arr=new char[s.length()];
        for(i=0;i<s.length();i++){
            arr[i]=s.charAt(i);
        }
        for(i=0;i<s.length();i++){
            if(arr[i]=='(')
            push(arr[i]);
            else if(top>=0)
            pop();
            else
            count++;
        }
        return top+1+count;
    }
        void push(char ch){
        top++;
        arr[top]=ch;
        }
        void pop(){
        top--;
        }
}