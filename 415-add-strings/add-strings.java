class Solution {
    public String addStrings(String num1,String num2) {
        if(num1.isEmpty()) return num2;
        if(num2.isEmpty()) return num1;
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        StringBuilder result=new StringBuilder();
        while(i>=0||j>=0||carry>0){
            int digit1=(i>=0)?num1.charAt(i)-'0':0;
            int digit2=(j>=0)?num2.charAt(j)-'0':0;
            int sum=digit1+digit2+carry;
            carry=sum/10;
            sum%=10;
            result.append((char)('0'+sum));
            i--;
            j--;
        }
        result.reverse();
        return result.toString();
    }
}

// int s=0;
//         s=Integer.parseInt(num1)+Integer.parseInt(num2);
//         return Integer.toString(s);