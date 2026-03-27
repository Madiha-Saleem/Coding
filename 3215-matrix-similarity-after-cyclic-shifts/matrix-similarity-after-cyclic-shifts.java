class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m,n,i,j;
        m=mat.length;
        n=mat[0].length;
        k=k%n;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(mat[i][(j+k)%n]!=mat[i][j])
            return false;
            }
        }
        return true;
    }
}