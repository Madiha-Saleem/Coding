class Solution {
    public int diagonalSum(int[][] mat) {
        int i,j,m,n,s=0;
        m=mat.length;
        n=mat[0].length;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(i==j||((i+j)==(n-1)&&(i!=n-1-i)))
                s=s+mat[i][j];
            }
        }
        return s;
    }
}