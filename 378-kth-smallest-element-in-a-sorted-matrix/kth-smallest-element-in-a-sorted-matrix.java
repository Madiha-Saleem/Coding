class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int i,j,x=0,n;
        n=matrix.length;
        int arr[]=new int[n*n];
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                    arr[x]=matrix[i][j];
                    x++;
                }
            }
            Arrays.sort(arr);
        return arr[k-1];
    }
}