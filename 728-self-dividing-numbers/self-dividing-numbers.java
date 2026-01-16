class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> no = new ArrayList<>();
        int i,digit=0,num;
        for(i=left;i<=right;i++){
            num=i;
            boolean isSelfDividing=true;
            while(num>0){
                digit=num%10;
                if(digit==0||i%digit!=0){
                    isSelfDividing=false;
                    break;
                }
                num=num/10;
            }
            if(isSelfDividing)
            no.add(i);
        }
        return no;
    }
}