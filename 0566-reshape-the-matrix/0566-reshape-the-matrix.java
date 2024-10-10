class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int arr[][] = new int[r][c];
        int m = mat.length;
        int n = mat[0].length;
        if(m*n!=r*c){
            return mat;
        } 
        int k = 0;
        int l = 0;
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
              arr[i][j] = mat[k][l];
                l++;
                if(l>=n){
                    l=0;
                    k++;
                }
            }
        
        }
        return arr;
    }
}