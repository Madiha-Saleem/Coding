class Solution {
    int top=-1;
    int max=10000;
    int stack[]=new int[max];
    void push(int x){
        stack[++top]=x;
    }
    int pop(){
        return stack[top--];
    }
    public int evalRPN(String[] tokens) {
        int a,b;
        for(String token:tokens){
            if(token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/")){
                b=pop();
                a=pop();
                switch(token){
                    case "+": push(a + b); break;
                    case "-": push(a - b); break;
                    case "*": push(a * b); break;
                    case "/": push(a / b); break;
                }
            } 
            else{
                push(Integer.parseInt(token));
            }
        }
        return pop();
    }
}