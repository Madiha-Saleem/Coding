class Solution {
    int arr[];
        int i,top=-1,count=0;
    public int minInsertions(String s) {
        arr=new int[s.length()];
        int i;
        for(i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[i]=s.charAt(i);
            if(arr[i]=='(')
            push(arr[i]);
            else if(i+1<s.length()&&s.charAt(i+1)==')'){
                if(top==-1)
                count++;
                else
                pop();
                i++;
            }
            else{
                count++;
                if(top==-1)
                count++;
                else
                pop();
            }
        }
        return count+2*(top + 1);
    }
    void push(int value){
        arr[++top]=value;
    }
    void pop(){
        top--;
    }
}