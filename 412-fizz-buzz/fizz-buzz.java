/*class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list=new ArrayList<>();
        int i;
        for(i=1;i<=n;i++){
            if(i%3==0&&i%5==0)
            list.add("FizzBuzz");
            else if(i%3==0)
            list.add("Fizz");
            else if(i%5==0)
            list.add("Buzz");
            else
            list.add(String.valueOf(i));
        }
        return list;
    }
}*/

class Solution {
    public List<String> fizzBuzz(int n) {
        String[] arr=new String[n];
        int i;
        for(i=1;i<=n;i++){
            if(i%3==0&&i%5==0)
            arr[i-1]="FizzBuzz";
            else if(i%3==0)
            arr[i-1]="Fizz";
            else if(i%5==0)
            arr[i-1]="Buzz";
            else
            arr[i-1]=String.valueOf(i);
        }
        return Arrays.asList(arr);
    }
}