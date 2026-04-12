class Solution {
    public boolean isToeplitz(int[][] mat) {
        // code here
        int m = mat.length;
        int n = mat[0].length;
    
        for (int i = 1; i < m; i++){
            for (int j = 1; j < n; j++){
                if (mat[i][j] != mat[i-1][j-1]){
                    return false;
                }
            }
        }
        return true;
    }
}
