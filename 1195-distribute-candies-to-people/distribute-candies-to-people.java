class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int arr[]=new int[num_people];
        int i=0,give=1;
        while(candies>0){
            if(candies>=give){
                arr[i]+=give;
                candies-=give;
            }
            else{
                arr[i]+=candies;
                candies=0;
            }
            give++;
            i=(i+1)%num_people;
        }
        return arr;
    }
}