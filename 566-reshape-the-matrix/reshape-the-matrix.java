class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int i,j,m,n,k=0;
        m=mat.length;
        n=mat[0].length;
        int []arr=new int[m*n];
        if(m*n!=r*c)
        return mat;
        int[][] mat1=new int[r][c];
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                arr[k]=mat[i][j];
                k++;
            }
        }
        k=0;
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                mat1[i][j]=arr[k];
                k++;
            }
        }
        return mat1;
    }
}